//
// Created by 沈王强 on 2017/9/13.
//

#include "com_shen_opengles_NdkJniUtils.h"
/*
 * Class:     com_shen_opengles_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_shen_opengles_NdkJniUtils_getCLanguageString
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"This just a test forjslkfjladjflajsldfjaldjflajdljfalj\n Android Studio NDK JNI developer!");
  }