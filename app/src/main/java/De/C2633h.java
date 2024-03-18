package de;

import Cd.C0325j;
import G.C0550e;
import com.google.android.gms.internal.play_billing.N;
import ee.C2885c;
import ee.C2886d;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import jf.y;

/* renamed from: de.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2633h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28232Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2635j f28233Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ l f28234h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f28235i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f28236j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2633h(Object obj, C2635j c2635j, l lVar, float f6, int i10) {
        super(1);
        this.f28232Y = i10;
        this.f28236j0 = obj;
        this.f28233Z = c2635j;
        this.f28234h0 = lVar;
        this.f28235i0 = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        boolean z10;
        boolean z11;
        int i10 = this.f28232Y;
        Object obj2 = this.f28236j0;
        switch (i10) {
            case 0:
                C2631f c2631f = (C2631f) ((C2632g) ((C0550e) obj2).f5498c).f28228a.invoke(Integer.valueOf(((Number) obj).intValue()));
                AbstractC3557B.c0("<this>", c2631f);
                C2635j c2635j = this.f28233Z;
                AbstractC3557B.c0("pinConfiguration", c2635j);
                l lVar = this.f28234h0;
                AbstractC3557B.c0("dimensions", lVar);
                int i11 = c2631f.f28224a;
                Cf.g D02 = N.D0(0, i11);
                AbstractC3557B.c0("range", D02);
                List list = lVar.f28242a;
                float a5 = l.a(list, D02);
                List list2 = lVar.f28243b;
                int i12 = c2631f.f28225b;
                boolean z12 = c2635j.f28241c;
                if (z12 && i12 == list2.size() - 1) {
                    f6 = this.f28235i0 - ((Number) list2.get(list2.size() - 1)).floatValue();
                } else {
                    Cf.g D03 = N.D0(0, i12);
                    AbstractC3557B.c0("range", D03);
                    f6 = l.a(list2, D03);
                }
                Cf.g D04 = N.D0(i11, c2631f.f28226c + i11);
                AbstractC3557B.c0("range", D04);
                float a10 = l.a(list, D04);
                Cf.g D05 = N.D0(i12, c2631f.f28227d + i12);
                AbstractC3557B.c0("range", D05);
                float a11 = l.a(list2, D05);
                if (i11 < ((Number) c2635j.f28239a.invoke(Integer.valueOf(i12))).intValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z12 || i12 != list2.size() - 1) {
                    if (i12 >= ((Number) c2635j.f28240b.invoke(Integer.valueOf(i11))).intValue()) {
                        z11 = false;
                        return new C2885c(a5, f6, a10, a11, z10, z11);
                    }
                }
                z11 = true;
                return new C2885c(a5, f6, a10, a11, z10, z11);
            default:
                C0550e c0550e = (C0550e) obj;
                AbstractC3557B.c0("interval", c0550e);
                ee.p pVar = (ee.p) obj2;
                l lVar2 = this.f28234h0;
                C2635j c2635j2 = this.f28233Z;
                C2633h c2633h = new C2633h(c0550e, c2635j2, lVar2, this.f28235i0, 0);
                C2632g c2632g = (C2632g) c0550e.f5498c;
                wf.k kVar = c2632g.f28229b;
                C3288a c3288a = new C3288a(new C0325j(c0550e, 1, c2635j2), true, -274168141);
                pVar.getClass();
                wf.k kVar2 = c2632g.f28230c;
                AbstractC3557B.c0("contentType", kVar2);
                pVar.f29336a.a(c0550e.f5497b, new C2886d(c2633h, kVar, kVar2, c3288a));
                return y.f36177a;
        }
    }
}
