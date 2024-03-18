package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogHandler;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import r9.y;
import wf.n;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public /* synthetic */ class LogUtilsKt$infoLog$1 extends k implements n {
    public LogUtilsKt$infoLog$1(Object obj) {
        super(2, obj, LogHandler.class, "i", "i(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return jf.y.f36177a;
    }

    public final void invoke(String str, String str2) {
        AbstractC3557B.c0("p0", str);
        AbstractC3557B.c0("p1", str2);
        ((LogHandler) this.receiver).i(str, str2);
    }
}
