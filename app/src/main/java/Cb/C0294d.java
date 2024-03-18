package Cb;

import android.content.res.Resources;
import b5.C2128c;
import f5.C2937a;
import java.util.Locale;
import wd.EnumC6206t;

/* renamed from: Cb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294d {

    /* renamed from: a  reason: collision with root package name */
    public final C2128c f2935a;

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.c, java.lang.Object] */
    public C0294d(EnumC6206t enumC6206t, Vc.y yVar) {
        String str;
        int i10;
        Locale locale = r9.y.n0(Resources.getSystem().getConfiguration()).f50327a.get(0);
        if (locale != null) {
            str = locale.getLanguage();
        } else {
            str = null;
        }
        ?? obj = new Object();
        obj.f25638c = "";
        obj.f25639d = str;
        obj.f25636a = "https://openai-api.arkoselabs.com/v2";
        obj.f25637b = yVar.f18580o;
        this.f2935a = obj;
        if (enumC6206t == EnumC6206t.f48459Y) {
            i10 = 4;
        } else {
            i10 = 15;
        }
        if ((i10 < 4 || i10 > 6) && i10 != 15) {
            C2937a.c("ArkoseManager", "Invalid log level specified in setLogLevel(), ignoring.", new Throwable[0]);
        } else {
            C2937a.f29641b.f29642a = i10;
        }
    }
}
