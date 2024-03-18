package dg;

import id.AbstractC3557B;
import java.util.HashMap;
import kg.C4294f;

/* renamed from: dg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2664d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC2666f f28309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f28310b;

    public C2664d(AbstractC2666f abstractC2666f, HashMap hashMap, HashMap hashMap2) {
        this.f28309a = abstractC2666f;
        this.f28310b = hashMap;
    }

    public final C2662b a(C4294f c4294f, String str) {
        AbstractC3557B.c0("name", c4294f);
        String b10 = c4294f.b();
        AbstractC3557B.b0("asString(...)", b10);
        return new C2662b(this, Cf.k.l(b10, str));
    }
}
