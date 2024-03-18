package j;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import g.C3116i;
import java.util.HashMap;

/* renamed from: j.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3874d implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f35798Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC3873c f35799Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ P4.a f35800h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ h f35801i0;

    public C3874d(C3116i c3116i, String str, AbstractC3873c abstractC3873c, k.h hVar) {
        this.f35801i0 = c3116i;
        this.f35798Y = str;
        this.f35799Z = abstractC3873c;
        this.f35800h0 = hVar;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        boolean equals = EnumC2081p.ON_START.equals(enumC2081p);
        String str = this.f35798Y;
        h hVar = this.f35801i0;
        if (equals) {
            HashMap hashMap = hVar.f35814e;
            AbstractC3873c abstractC3873c = this.f35799Z;
            P4.a aVar = this.f35800h0;
            hashMap.put(str, new f(abstractC3873c, aVar));
            HashMap hashMap2 = hVar.f35815f;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                abstractC3873c.d(obj);
            }
            Bundle bundle = hVar.f35816g;
            C3872b c3872b = (C3872b) bundle.getParcelable(str);
            if (c3872b != null) {
                bundle.remove(str);
                abstractC3873c.d(aVar.v0(c3872b.f35797Z, c3872b.f35796Y));
            }
        } else if (EnumC2081p.ON_STOP.equals(enumC2081p)) {
            hVar.f35814e.remove(str);
        } else if (EnumC2081p.ON_DESTROY.equals(enumC2081p)) {
            hVar.e(str);
        }
    }
}
