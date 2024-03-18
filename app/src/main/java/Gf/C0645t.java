package Gf;

import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ng.AbstractC4838e;
import wf.AbstractC6216a;

/* renamed from: Gf.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0645t extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6474Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0649x f6475Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0645t(C0649x c0649x, int i10) {
        super(0);
        this.f6474Y = i10;
        this.f6475Z = c0649x;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final List mo122invoke() {
        int i10 = this.f6474Y;
        C0649x c0649x = this.f6475Z;
        switch (i10) {
            case 0:
                c0649x.getClass();
                Df.v[] vVarArr = C0649x.f6486n;
                Df.v vVar = vVarArr[13];
                Object mo122invoke = c0649x.f6496l.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke);
                Df.v vVar2 = vVarArr[14];
                Object mo122invoke2 = c0649x.f6497m.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke2);
                return kf.t.w2((Collection) mo122invoke2, (Collection) mo122invoke);
            case 1:
                c0649x.getClass();
                Df.v[] vVarArr2 = C0649x.f6486n;
                Df.v vVar3 = vVarArr2[9];
                Object mo122invoke3 = c0649x.f6492h.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke3);
                Df.v vVar4 = vVarArr2[11];
                Object mo122invoke4 = c0649x.f6494j.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke4);
                return kf.t.w2((Collection) mo122invoke4, (Collection) mo122invoke3);
            case 2:
                c0649x.getClass();
                Df.v[] vVarArr3 = C0649x.f6486n;
                Df.v vVar5 = vVarArr3[10];
                Object mo122invoke5 = c0649x.f6493i.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke5);
                Df.v vVar6 = vVarArr3[12];
                Object mo122invoke6 = c0649x.f6495k.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke6);
                return kf.t.w2((Collection) mo122invoke6, (Collection) mo122invoke5);
            case 3:
                return A0.d(c0649x.a());
            case 4:
                c0649x.getClass();
                Df.v[] vVarArr4 = C0649x.f6486n;
                Df.v vVar7 = vVarArr4[9];
                Object mo122invoke7 = c0649x.f6492h.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke7);
                Df.v vVar8 = vVarArr4[10];
                Object mo122invoke8 = c0649x.f6493i.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke8);
                return kf.t.w2((Collection) mo122invoke8, (Collection) mo122invoke7);
            case 5:
                ug.n i02 = c0649x.a().i0();
                AbstractC3557B.b0("getUnsubstitutedInnerClassesScope(...)", i02);
                ArrayList arrayList = new ArrayList();
                for (Object obj : Bi.c.Q0(i02, null, 3)) {
                    if (!AbstractC4838e.m((AbstractC1003l) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC1003l abstractC1003l = (AbstractC1003l) it.next();
                    AbstractC0997f abstractC0997f = abstractC1003l instanceof AbstractC0997f ? (AbstractC0997f) abstractC1003l : null;
                    Class k10 = abstractC0997f != null ? A0.k(abstractC0997f) : null;
                    B b10 = k10 != null ? new B(k10) : null;
                    if (b10 != null) {
                        arrayList2.add(b10);
                    }
                }
                return arrayList2;
            default:
                Collection<AbstractC0997f> i11 = c0649x.a().i();
                AbstractC3557B.b0("getSealedSubclasses(...)", i11);
                ArrayList arrayList3 = new ArrayList();
                for (AbstractC0997f abstractC0997f2 : i11) {
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", abstractC0997f2);
                    Class k11 = A0.k(abstractC0997f2);
                    B b11 = k11 != null ? new B(k11) : null;
                    if (b11 != null) {
                        arrayList3.add(b11);
                    }
                }
                return arrayList3;
        }
    }
}
