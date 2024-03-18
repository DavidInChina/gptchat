package Bg;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Bg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0212e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f2114Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X f2115Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Eg.k f2116h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Eg.g f2117i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212e(ArrayList arrayList, X x10, Eg.k kVar, Eg.g gVar) {
        super(1);
        this.f2114Y = arrayList;
        this.f2115Z = x10;
        this.f2116h0 = kVar;
        this.f2117i0 = gVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        S s10 = (S) obj;
        AbstractC3557B.c0("$this$runForkingPoint", s10);
        for (Eg.g gVar : this.f2114Y) {
            Eg.g gVar2 = this.f2117i0;
            C0211d c0211d = new C0211d(this.f2115Z, this.f2116h0, gVar, gVar2);
            if (!s10.f2086a) {
                s10.f2086a = ((Boolean) c0211d.mo122invoke()).booleanValue();
            }
        }
        return jf.y.f36177a;
    }
}
