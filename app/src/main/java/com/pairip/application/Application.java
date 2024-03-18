package com.pairip.application;

import android.content.Context;
import com.openai.chatgpt.app.MainApplication;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;

/* loaded from: classes.dex */
public class Application extends MainApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}
