package k5;

import E2.C0479k;
import android.text.TextUtils;
import g5.C3200b;
import id.AbstractC3557B;
import j5.AbstractC3910a;
import java.util.Date;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class x implements AbstractC3910a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC3910a f37088Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f37089Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ com.auth0.android.request.internal.k f37090h0;

    public x(y yVar, z zVar, com.auth0.android.request.internal.k kVar) {
        this.f37088Y = yVar;
        this.f37089Z = zVar;
        this.f37090h0 = kVar;
    }

    @Override // j5.AbstractC3910a
    public final void a(Object obj) {
        C4175a c4175a = (C4175a) obj;
        AbstractC3910a abstractC3910a = this.f37088Y;
        AbstractC3557B.c0("result", c4175a);
        z zVar = this.f37089Z;
        String str = zVar.f37104p;
        AbstractC3557B.Z(str);
        C0479k c0479k = new C0479k(str, zVar.f37101m.f31907a.f31279a, c4175a);
        LinkedHashMap linkedHashMap = zVar.f37098j;
        String str2 = (String) linkedHashMap.get("max_age");
        if (!TextUtils.isEmpty(str2)) {
            AbstractC3557B.Z(str2);
            c0479k.f4372f = Integer.valueOf(str2);
        }
        c0479k.f4373g = zVar.f37103o;
        c0479k.f4371e = (String) linkedHashMap.get("nonce");
        c0479k.f4374h = new Date(System.currentTimeMillis());
        c0479k.f4370d = (String) linkedHashMap.get("organization");
        try {
            U3.f.r0(this.f37090h0, c0479k);
            abstractC3910a.a(null);
        } catch (J e10) {
            abstractC3910a.d(e10);
        }
    }

    @Override // j5.AbstractC3910a
    public final void d(C3200b c3200b) {
        this.f37088Y.d((J) c3200b);
    }
}
