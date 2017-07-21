package com.scan.plugin;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by YongChen.Yu on 2017/7/18.
 */

public class ScanCodePlugin extends CordovaPlugin {

    private Context context;
    private String m_Broadcastname;
    private static CallbackContext mCallbackContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("scanBarCode".equals(action)) {
            try {
                //speechSynthesize
                String content = args.getString(0);//页面传过来的参数
                context = cordova.getActivity().getBaseContext();//获取上下文
                mCallbackContext = callbackContext;
//              Intent intent = new Intent(context, MainActivity.class);
//              this.cordova.startActivityForResult(this,intent,1);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

//    private String barCode = "";
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        switch (resultCode) { //resultCode为回传的标记，我在第二个Activity中回传的是RESULT_OK
//            case Activity.RESULT_OK:
//                Bundle b=intent.getExtras();  //data为第二个Activity中回传的Intent
//                barCode = b.getString("code");//str即为回传的值
//                mCallbackContext.success(barCode);
//                break;
//            default:
//                break;
//        }
    }

    public static class Caller{
        private GetScanCodeMth getScanCodeMth;

        public Caller(){}

        public void setCallFunc(GetScanCodeMth getScanCodeMth){
            this.getScanCodeMth = getScanCodeMth;
        }

        public void sendDataToJs(){
            if(null != getScanCodeMth.GetBarCode()){
                mCallbackContext.success(getScanCodeMth.GetBarCode());
            }
        }
    }

    public interface GetScanCodeMth{
        String GetBarCode();
    }

}
