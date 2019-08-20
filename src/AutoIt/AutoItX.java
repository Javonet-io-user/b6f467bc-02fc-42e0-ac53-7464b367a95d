package AutoIt;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import AutoIt.*;
import jio.System.*;
import jio.System.Drawing.*;

public class AutoItX {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getINTDEFAULT() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("INTDEFAULT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINTDEFAULT(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("INTDEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_HIDE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_HIDE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_HIDE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_HIDE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWNORMAL() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWNORMAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWNORMAL(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWNORMAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_NORMAL() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_NORMAL");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_NORMAL(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_NORMAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWMINIMIZED() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWMINIMIZED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWMINIMIZED(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWMINIMIZED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWMAXIMIZED() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWMAXIMIZED");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWMAXIMIZED(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWMAXIMIZED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_MAXIMIZE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_MAXIMIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_MAXIMIZE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_MAXIMIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWNOACTIVATE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWNOACTIVATE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWNOACTIVATE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWNOACTIVATE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOW() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOW");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOW(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOW", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_MINIMIZE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_MINIMIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_MINIMIZE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_MINIMIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWMINNOACTIVE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWMINNOACTIVE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWMINNOACTIVE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWMINNOACTIVE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWNA() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWNA");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWNA(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWNA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_RESTORE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_RESTORE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_RESTORE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_RESTORE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_SHOWDEFAULT() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_SHOWDEFAULT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_SHOWDEFAULT(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_SHOWDEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getSW_FORCEMINIMIZE() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").get("SW_FORCEMINIMIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSW_FORCEMINIMIZE(java.lang.Integer param) {
    try {
      Javonet.getType("AutoIt.AutoItX").set("SW_FORCEMINIMIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Init() {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("Init");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ErrorCode() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("ErrorCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer AutoItSetOption(
      java.lang.String option, java.lang.Integer optionValue) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("AutoItSetOption", option, optionValue);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ClipGet(java.lang.Integer maxLen) {
    try {
      java.lang.String res = Javonet.getType("AutoIt.AutoItX").invoke("ClipGet", maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ClipPut(java.lang.String text) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("ClipPut", text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlClick(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String button,
      java.lang.Integer numClicks,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlClick", title, text, control, button, numClicks, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlClick(
      IntPtr winHandle,
      IntPtr controlHandle,
      java.lang.String button,
      java.lang.Integer numClicks,
      java.lang.Integer x,
      java.lang.Integer y) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlClick", winHandle, controlHandle, button, numClicks, x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlCommand(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String command,
      java.lang.String extra,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlCommand", title, text, control, command, extra, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlCommand(
      IntPtr winHandle,
      IntPtr controlHandle,
      java.lang.String command,
      java.lang.String extra,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlCommand", winHandle, controlHandle, command, extra, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlListView(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String command,
      java.lang.String extra1,
      java.lang.String extra2,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlListView", title, text, control, command, extra1, extra2, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlListView(
      IntPtr winHandle,
      IntPtr controlHandle,
      java.lang.String command,
      java.lang.String extra1,
      java.lang.String extra2,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlListView", winHandle, controlHandle, command, extra1, extra2, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlDisable(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlDisable", title, text, control);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlDisable(IntPtr winHandle, IntPtr controlHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlDisable", winHandle, controlHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlEnable(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlEnable", title, text, control);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlEnable(IntPtr winHandle, IntPtr controlHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlEnable", winHandle, controlHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlFocus(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlFocus", title, text, control);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlFocus(IntPtr winHandle, IntPtr controlHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlFocus", winHandle, controlHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlGetFocus(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlGetFocus", title, text, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlGetFocus(IntPtr winHandle, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlGetFocus", winHandle, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr ControlGetHandle(IntPtr winHandle, java.lang.String control) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("ControlGetHandle", winHandle, control);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlGetHandleAsText(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlGetHandleAsText", title, text, control, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle ControlGetPos(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("ControlGetPos", title, text, control);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle ControlGetPos(IntPtr winHandle, IntPtr controlHandle) {
    try {
      Object res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlGetPos", winHandle, controlHandle);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlGetText(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlGetText", title, text, control, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlGetText(
      IntPtr winHandle, IntPtr controlHandle, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlGetText", winHandle, controlHandle, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlHide(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlHide", title, text, control);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlHide(IntPtr winHandle, IntPtr controlHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlHide", winHandle, controlHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlMove(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlMove", title, text, control, x, y, width, height);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlMove(
      IntPtr winHandle,
      IntPtr controlHandle,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlMove", winHandle, controlHandle, x, y, width, height);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlSend(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String sendText,
      java.lang.Integer mode) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlSend", title, text, control, sendText, mode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlSend(
      IntPtr winHandle, IntPtr controlHandle, java.lang.String sendText, java.lang.Integer mode) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlSend", winHandle, controlHandle, sendText, mode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlSetText(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String controlText) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlSetText", title, text, control, controlText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlSetText(
      IntPtr winHandle, IntPtr controlHandle, java.lang.String controlText) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlSetText", winHandle, controlHandle, controlText);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlShow(
      java.lang.String title, java.lang.String text, java.lang.String control) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlShow", title, text, control);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ControlShow(IntPtr winHandle, IntPtr controlHandle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ControlShow", winHandle, controlHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlTreeView(
      java.lang.String title,
      java.lang.String text,
      java.lang.String control,
      java.lang.String command,
      java.lang.String extra1,
      java.lang.String extra2,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlTreeView", title, text, control, command, extra1, extra2, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ControlTreeView(
      IntPtr winHandle,
      IntPtr controlHandle,
      java.lang.String command,
      java.lang.String extra1,
      java.lang.String extra2,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("ControlTreeView", winHandle, controlHandle, command, extra1, extra2, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DriveMapAdd(
      java.lang.String device,
      java.lang.String share,
      java.lang.Integer flags,
      java.lang.String user,
      java.lang.String password) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("DriveMapAdd", device, share, flags, user, password);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer DriveMapDel(java.lang.String device) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("DriveMapDel", device);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DriveMapGet(java.lang.String device) {
    try {
      java.lang.String res = Javonet.getType("AutoIt.AutoItX").invoke("DriveMapGet", device);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer IsAdmin() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("IsAdmin");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer MouseClick(
      java.lang.String button,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer numClicks,
      java.lang.Integer speed) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("MouseClick", button, x, y, numClicks, speed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer MouseClickDrag(
      java.lang.String button,
      java.lang.Integer x1,
      java.lang.Integer y1,
      java.lang.Integer x2,
      java.lang.Integer y2,
      java.lang.Integer speed) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("MouseClickDrag", button, x1, y1, x2, y2, speed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void MouseDown(java.lang.String button) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("MouseDown", button);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer MouseGetCursor() {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("MouseGetCursor");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Point MouseGetPos() {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("MouseGetPos");
      if (res == null) return null;
      return new Point((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer MouseMove(
      java.lang.Integer x, java.lang.Integer y, java.lang.Integer speed) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("MouseMove", x, y, speed);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void MouseUp(java.lang.String button) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("MouseUp", button);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void MouseWheel(java.lang.String direction, java.lang.Integer numClicks) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("MouseWheel", direction, numClicks);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long PixelChecksum(Rectangle rect, java.lang.Integer step) {
    try {
      java.lang.Long res = Javonet.getType("AutoIt.AutoItX").invoke("PixelChecksum", rect, step);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer PixelGetColor(java.lang.Integer x, java.lang.Integer y) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("PixelGetColor", x, y);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Point PixelSearch(
      Rectangle rect, java.lang.Integer color, java.lang.Integer shade, java.lang.Integer step) {
    try {
      Object res =
          Javonet.getType("AutoIt.AutoItX").invoke("PixelSearch", rect, color, shade, step);
      if (res == null) return null;
      return new Point((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ProcessClose(java.lang.String process) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("ProcessClose", process);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ProcessExists(java.lang.String process) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("ProcessExists", process);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ProcessSetPriority(
      java.lang.String process, java.lang.Integer priority) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ProcessSetPriority", process, priority);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ProcessWait(java.lang.String process, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ProcessWait", process, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ProcessWaitClose(
      java.lang.String process, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("ProcessWaitClose", process, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Run(
      java.lang.String program, java.lang.String dir, java.lang.Integer showFlag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("Run", program, dir, showFlag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer RunAs(
      java.lang.String user,
      java.lang.String domain,
      java.lang.String password,
      java.lang.Integer logonFlag,
      java.lang.String program,
      java.lang.String dir,
      java.lang.Integer showFlag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("RunAs", user, domain, password, logonFlag, program, dir, showFlag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer RunAsWait(
      java.lang.String user,
      java.lang.String domain,
      java.lang.String password,
      java.lang.Integer logonFlag,
      java.lang.String program,
      java.lang.String dir,
      java.lang.Integer showFlag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX")
              .invoke("RunAsWait", user, domain, password, logonFlag, program, dir, showFlag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer RunWait(
      java.lang.String program, java.lang.String dir, java.lang.Integer showFlag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("RunWait", program, dir, showFlag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Send(java.lang.String sendText, java.lang.Integer mode) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("Send", sendText, mode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer Shutdown(java.lang.Integer flag) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("Shutdown", flag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Sleep(java.lang.Integer milliseconds) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("Sleep", milliseconds);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String StatusBarGetText(
      java.lang.String title,
      java.lang.String text,
      java.lang.Integer part,
      java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("StatusBarGetText", title, text, part, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String StatusBarGetText(
      IntPtr winHandle, java.lang.Integer part, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("StatusBarGetText", winHandle, part, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ToolTip(java.lang.String tip, java.lang.Integer x, java.lang.Integer y) {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("ToolTip", tip, x, y);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinActivate(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinActivate", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinActivate(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinActivate", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinActive(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinActive", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinActive(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinActive", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinExists(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinExists", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinExists(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinExists", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinClose(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinClose", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinClose(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinClose", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Point WinGetCaretPos() {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetCaretPos");
      if (res == null) return null;
      return new Point((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetClassList(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetClassList", title, text, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetClassList(IntPtr winHandle, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetClassList", winHandle, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle WinGetClientSize(java.lang.String title, java.lang.String text) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetClientSize", title, text);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle WinGetClientSize(IntPtr winHandle) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetClientSize", winHandle);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr WinGetHandle(java.lang.String title, java.lang.String text) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetHandle", title, text);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetHandleAsText(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetHandleAsText", title, text, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle WinGetPos(java.lang.String title, java.lang.String text) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetPos", title, text);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static Rectangle WinGetPos(IntPtr winHandle) {
    try {
      Object res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetPos", winHandle);
      if (res == null) return null;
      return new Rectangle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long WinGetProcess(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.Long res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetProcess", title, text, maxLen);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long WinGetProcess(IntPtr winHandle, java.lang.Integer maxLen) {
    try {
      java.lang.Long res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetProcess", winHandle, maxLen);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinGetState(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetState", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinGetState(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinGetState", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetText(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetText", title, text, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetText(IntPtr winHandle, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetText", winHandle, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetTitle(
      java.lang.String title, java.lang.String text, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetTitle", title, text, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String WinGetTitle(IntPtr winHandle, java.lang.Integer maxLen) {
    try {
      java.lang.String res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinGetTitle", winHandle, maxLen);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinKill(java.lang.String title, java.lang.String text) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinKill", title, text);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinKill(IntPtr winHandle) {
    try {
      java.lang.Integer res = Javonet.getType("AutoIt.AutoItX").invoke("WinKill", winHandle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WinMinimizeAll() {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("WinMinimizeAll");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WinMinimizeAllUndo() {
    try {
      Javonet.getType("AutoIt.AutoItX").invoke("WinMinimizeAllUndo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinMove(
      java.lang.String title,
      java.lang.String text,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinMove", title, text, x, y, width, height);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinMove(
      IntPtr winHandle,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer width,
      java.lang.Integer height) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinMove", winHandle, x, y, width, height);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetOnTop(
      java.lang.String title, java.lang.String text, java.lang.Integer flag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetOnTop", title, text, flag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetOnTop(IntPtr winHandle, java.lang.Integer flag) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetOnTop", winHandle, flag);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetState(
      java.lang.String title, java.lang.String text, java.lang.Integer flags) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetState", title, text, flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetState(IntPtr winHandle, java.lang.Integer flags) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetState", winHandle, flags);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetTitle(
      java.lang.String title, java.lang.String text, java.lang.String newTitle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetTitle", title, text, newTitle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetTitle(IntPtr winHandle, java.lang.String newTitle) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetTitle", winHandle, newTitle);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetTrans(
      java.lang.String title, java.lang.String text, java.lang.Integer trans) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetTrans", title, text, trans);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinSetTrans(IntPtr winHandle, java.lang.Integer trans) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinSetTrans", winHandle, trans);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWait(
      java.lang.String title, java.lang.String text, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWait", title, text, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWait(IntPtr winHandle, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWait", winHandle, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitActive(
      java.lang.String title, java.lang.String text, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitActive", title, text, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitActive(IntPtr winHandle, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitActive", winHandle, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitClose(
      java.lang.String title, java.lang.String text, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitClose", title, text, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitClose(IntPtr winHandle, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitClose", winHandle, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitNotActive(
      java.lang.String title, java.lang.String text, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitNotActive", title, text, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer WinWaitNotActive(IntPtr winHandle, java.lang.Integer timeout) {
    try {
      java.lang.Integer res =
          Javonet.getType("AutoIt.AutoItX").invoke("WinWaitNotActive", winHandle, timeout);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
