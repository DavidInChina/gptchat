package hc;

import Uc.C1428m;
import Uc.C1429n;
import Uc.EnumC1427l;
import s3.C5545H;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32148Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f32149Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Tc.f fVar, int i10) {
        super(0);
        this.f32148Y = i10;
        this.f32149Z = fVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f32148Y;
        Tc.f fVar = this.f32149Z;
        switch (i10) {
            case 0:
                C5545H c5545h = fVar.f17057b;
                C1428m c1428m = C1428m.f17688i;
                EnumC1427l enumC1427l = EnumC1427l.f17684Z;
                Bi.c.r1(c5545h, "custom-instructions/model");
                return;
            case 1:
                Bi.c.r1(fVar.f17057b, C1429n.f17690k.o1());
                return;
            case 2:
                fVar.f17057b.p();
                return;
            case 3:
                fVar.f17057b.p();
                return;
            case 4:
                fVar.f17057b.p();
                return;
            case 5:
                fVar.f17057b.p();
                return;
            case 6:
                fVar.f17057b.p();
                return;
            default:
                fVar.f17057b.p();
                return;
        }
    }
}
