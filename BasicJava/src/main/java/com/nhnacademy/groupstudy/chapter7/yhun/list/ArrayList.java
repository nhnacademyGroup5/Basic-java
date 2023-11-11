package com.nhnacademy.groupstudy.chapter7.yhun.list;

import java.util.Arrays;

public class ArrayList<T> implements List<T>{
     private final int CAPACITY = 16;

     private int size;
     private Object[] arrayList;

     public ArrayList(){
          arrayList = new Object[CAPACITY];
          this.size = 0;
     }

     public ArrayList(int capacity){
          if(capacity > 0){
               arrayList = new Object[capacity];
          }else if(capacity == 0){
               arrayList = new Object[CAPACITY];
          }else{
               throw new IllegalArgumentException("capacity error");
          }
          this.size = 0;
     }


     private void resize(){
          int arrSize = arrayList.length;

          if(size == arrSize){
               arrayList = Arrays.copyOf(arrayList, arrSize*2);
          } else if(size < arrSize / 2){
               arrayList = Arrays.copyOf(arrayList, Math.max(CAPACITY, arrSize/2));
          }
     }

     @Override
     public void add(T val){
          resize();
          arrayList[size++] = val;
     }

     @Override
     public void add(int index, T val){
          if(index < 0 || index > size){
               throw new IndexOutOfBoundsException();
          }

          if(size == index){
               add(val);
          }else{
               resize();

               for(int i=size; i > index; i--){
                    arrayList[i] = arrayList[i-1];
               }

               arrayList[index] = val;
               size++;
          }
     }

     @Override
     public int indexOf(T val){
          for(int i=0; i<size; i++){
               if(arrayList[i].equals(val))
                    return i;
          }

          return -1;
     }

     @Override
     public T remove(int index) {
          if(index < 0 || index >= size){
               throw new IndexOutOfBoundsException();
          }

          @SuppressWarnings("unchecked") T val = (T) arrayList[index];
          arrayList[index] = null;

          for(int i=index; i<size-1; i++){
               arrayList[i] = arrayList[i-1];
          }

          arrayList[--size] = null;
          resize();
          return val;
     }

     @Override
     public boolean remove(T val){
          int index = indexOf(val);

          if(index < 0)
               return false;

          remove(index);
          return true;
     }

     @Override
     @SuppressWarnings("unchecked")
     public T get(int index){
          if(index < 0 || index >= size)
               throw new IndexOutOfBoundsException();

          return (T) arrayList[index];
     }

     @Override
     public void set(int index, T val){
          if(index < 0 || index >= size)
               throw new IndexOutOfBoundsException();

          arrayList[index] = val;
     }

     @Override
     public int size() {
          return size;
     }

     @Override
     public boolean isEmpty() {
          return size == 0;
     }

     @Override
     public void clear() {
          arrayList = new Object[CAPACITY];
          size = 0;
     }

     @Override
     public String toString() {
          // java ArrayList().toString은 AbstractCollection Class에 구현되어 잇음.
          StringBuilder sb = new StringBuilder();
          for(int i=0; i<size-1; i++){
               sb.append(arrayList[i]).append(" ");
          }sb.append(arrayList[size-1]);
          return sb.toString();
     }
}
