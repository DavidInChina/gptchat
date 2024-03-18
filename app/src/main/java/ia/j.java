package Ia;

import Df.H;
import N.W;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.j0;
import We.v;
import Xe.B;
import jf.y;
import na.L0;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rb.C5436z;
import rc.C5472v;
import rd.AbstractC5482f;
import wd.EnumC6181c;
import wf.p;

/* loaded from: classes2.dex */
public final class j implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8514Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f8515Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f8516h0;

    public /* synthetic */ j(Object obj, int i10, Object obj2) {
        this.f8514Y = i10;
        this.f8515Z = obj;
        this.f8516h0 = obj2;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f8514Y;
        Object obj = this.f8516h0;
        Object obj2 = this.f8515Z;
        switch (i10) {
            case 0:
                Object b10 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 4, (String) obj), abstractC4825e);
                if (b10 == EnumC5000a.f41328Y) {
                    return b10;
                }
                return yVar;
            case 1:
                Object b11 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 6, (C5436z) obj), abstractC4825e);
                if (b11 == EnumC5000a.f41328Y) {
                    return b11;
                }
                return yVar;
            case 2:
                Object b12 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 7, (nd.h) obj), abstractC4825e);
                if (b12 == EnumC5000a.f41328Y) {
                    return b12;
                }
                return yVar;
            case 3:
                Object b13 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 8, (C5472v) obj), abstractC4825e);
                if (b13 == EnumC5000a.f41328Y) {
                    return b13;
                }
                return yVar;
            case 4:
                Object b14 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 9, (zd.k) obj), abstractC4825e);
                if (b14 == EnumC5000a.f41328Y) {
                    return b14;
                }
                return yVar;
            case 5:
                Object b15 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 10, (EnumC6181c) obj), abstractC4825e);
                if (b15 == EnumC5000a.f41328Y) {
                    return b15;
                }
                return yVar;
            case 6:
                Object b16 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 11, (C4812a) obj), abstractC4825e);
                if (b16 == EnumC5000a.f41328Y) {
                    return b16;
                }
                return yVar;
            case 7:
                Object b17 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 12, (AbstractC5482f) obj), abstractC4825e);
                if (b17 == EnumC5000a.f41328Y) {
                    return b17;
                }
                return yVar;
            case 8:
                Object b18 = ((AbstractC1206i) obj2).b(new W(abstractC1207j, 13, (Dd.W) obj), abstractC4825e);
                if (b18 == EnumC5000a.f41328Y) {
                    return b18;
                }
                return yVar;
            case 9:
                Object b19 = ((AbstractC1206i) obj2).b(new v(abstractC1207j, (B) obj), abstractC4825e);
                if (b19 == EnumC5000a.f41328Y) {
                    return b19;
                }
                return yVar;
            default:
                Object u10 = H.u(abstractC4825e, j0.f14864Y, new L0((AbstractC4825e) null, (p) obj, 10), abstractC1207j, (AbstractC1206i[]) obj2);
                if (u10 == EnumC5000a.f41328Y) {
                    return u10;
                }
                return yVar;
        }
    }
}
