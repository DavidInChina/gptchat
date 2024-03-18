package Fh;

import Qh.AbstractC1239q;
import Qh.P;
import Qh.X;
import java.util.ArrayList;
import java.util.Iterator;
import th.AbstractC5802j;
import th.AbstractC5806n;
import wh.AbstractC6226B;
import wh.AbstractC6250o;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public abstract class z extends Enum implements B, w {

    /* renamed from: Y  reason: collision with root package name */
    public static final y f5405Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ z[] f5406Z;
    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z() { // from class: Fh.x
            @Override // Fh.z
            public final j c(j jVar, o oVar, AbstractC6250o abstractC6250o) {
                return jVar;
            }
        };
        y yVar = new y();
        f5405Y = yVar;
        f5406Z = new z[]{zVar, yVar};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f5406Z.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0041 A[SYNTHETIC] */
    @Override // Fh.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Nh.l lVar, AbstractC6250o abstractC6250o, o oVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = 0;
        j g10 = C0542c.g((j) abstractC6250o.getReturnType().k(new C0542c(new C0541b(new C0544e(lVar)), oVar, 335544320, "")), oVar, false, 0, abstractC6250o.r0());
        AbstractC5806n declaredAnnotations = abstractC6250o.getDeclaredAnnotations();
        P p10 = X.STARTS_WITH;
        AbstractC1239q abstractC1239q = (AbstractC1239q) declaredAnnotations;
        int i11 = abstractC1239q.f15001Y;
        AbstractC1239q abstractC1239q2 = abstractC1239q;
        switch (i11) {
            case 0:
                ArrayList arrayList = new ArrayList(abstractC1239q.size());
                Iterator it = abstractC1239q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        l1 d10 = ((AbstractC5802j) next).d();
                        if (d10 != null) {
                            String f12 = d10.f1();
                            if (f12 != null && p10.a("jdk.internal.", f12)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z11 = true;
                                if (z11) {
                                    z10 = true;
                                    if (!(true ^ z10)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                    z10 = false;
                    if (!(true ^ z10)) {
                    }
                }
                int size = arrayList.size();
                int size2 = abstractC1239q.size();
                abstractC1239q2 = abstractC1239q;
                if (size != size2) {
                    abstractC1239q2 = abstractC1239q.y(arrayList);
                    break;
                }
                break;
        }
        C0541b c0541b = g10;
        for (AbstractC5802j abstractC5802j : (AbstractC5806n) abstractC1239q2) {
            C0541b c0541b2 = (C0541b) c0541b;
            c0541b2.a(abstractC5802j, oVar);
            c0541b = c0541b2;
        }
        for (AbstractC6226B abstractC6226B : abstractC6250o.getParameters()) {
            C0541b c0541b3 = new C0541b(new C0545f(abstractC6226B.getIndex(), lVar));
            C0541b c0541b4 = (j) abstractC6226B.getType().k(new C0542c(c0541b3, oVar, (abstractC6226B.getIndex() << 16) | 369098752, ""));
            for (AbstractC5802j abstractC5802j2 : abstractC6226B.getDeclaredAnnotations()) {
                C0541b c0541b5 = (C0541b) c0541b4;
                c0541b5.a(abstractC5802j2, oVar);
                c0541b4 = c0541b5;
            }
        }
        j c10 = c(c0541b, oVar, abstractC6250o);
        for (l1.a aVar : abstractC6250o.V()) {
            c10 = (j) aVar.k(new C0542c(c10, oVar, (i10 << 8) | 385875968, ""));
            i10++;
        }
    }

    public abstract j c(j jVar, o oVar, AbstractC6250o abstractC6250o);

    @Override // Fh.w
    public final B a(l1 l1Var) {
        return this;
    }
}
