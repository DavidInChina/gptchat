package xb;

import Df.H;
import Df.w;
import Lg.n;
import Rc.i;
import Rc.l;
import Rc.o;
import Sc.j;
import Sc.u;
import Sc.v;
import Vc.q;
import Vc.r;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.C6190g0;
import wd.EnumC6212z;
import x8.W;
import yf.AbstractC6583a;

/* renamed from: xb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6390c {

    /* renamed from: a  reason: collision with root package name */
    public final Yc.a f49785a;

    public C6390c(Yc.a aVar) {
        this.f49785a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z10, AbstractC4825e abstractC4825e) {
        C6388a c6388a;
        int i10;
        x xVar;
        EnumC6212z enumC6212z;
        u uVar;
        C6190g0 c6190g0;
        C6190g0 c6190g02;
        C6190g0 c6190g03;
        C6190g0 c6190g04;
        C6190g0 c6190g05;
        EnumC6212z enumC6212z2;
        v vVar;
        if (abstractC4825e instanceof C6388a) {
            c6388a = (C6388a) abstractC4825e;
            int i11 = c6388a.f49781h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c6388a.f49781h0 = i11 - Integer.MIN_VALUE;
                Object obj = c6388a.f49779Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c6388a.f49781h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C6389b c6389b = new C6389b(z10, null);
                    w a5 = C.a(Rc.c.class);
                    Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Rc.c.class), a5);
                    c6388a.f49781h0 = 1;
                    Yc.a aVar = this.f49785a;
                    aVar.getClass();
                    obj = W.S(aVar, n22, c6389b, c6388a);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                xVar = (x) obj;
                if (!(xVar instanceof Vc.w)) {
                    Rc.c cVar = (Rc.c) ((Vc.w) xVar).f18565a;
                    cVar.getClass();
                    List<i> list = cVar.f15385a;
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (i iVar : list) {
                        iVar.getClass();
                        String str = iVar.f15396a;
                        if (AbstractC3557B.K(str, "gpt_3.5")) {
                            enumC6212z2 = EnumC6212z.f48474Y;
                        } else if (AbstractC3557B.K(str, "gpt_4")) {
                            enumC6212z2 = EnumC6212z.f48475Z;
                        } else {
                            enumC6212z2 = EnumC6212z.f48478j0;
                        }
                        EnumC6212z enumC6212z3 = enumC6212z2;
                        String str2 = iVar.f15398c;
                        if (AbstractC3557B.K(str2, "free")) {
                            vVar = v.f16555Y;
                        } else if (AbstractC3557B.K(str2, "plus")) {
                            vVar = v.f16556Z;
                        } else {
                            vVar = v.f16557h0;
                        }
                        v vVar2 = vVar;
                        arrayList.add(new j(enumC6212z3, iVar.f15397b, vVar2, iVar.f15399d, iVar.f15400e, iVar.f15401f, iVar.f15402g, iVar.f15403h, iVar.f15404i));
                    }
                    List<l> list2 = cVar.f15386b;
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (l lVar : list2) {
                        lVar.getClass();
                        Iterator it = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            String str3 = lVar.f15408a;
                            if (hasNext) {
                                i iVar2 = (i) it.next();
                                C6190g0[] c6190g0Arr = new C6190g0[6];
                                c6190g0Arr[0] = new C6190g0(iVar2.f15399d);
                                String str4 = iVar2.f15400e;
                                if (str4 != null) {
                                    c6190g0 = new C6190g0(str4);
                                } else {
                                    c6190g0 = null;
                                }
                                c6190g0Arr[1] = c6190g0;
                                String str5 = iVar2.f15401f;
                                if (str5 != null) {
                                    c6190g02 = new C6190g0(str5);
                                } else {
                                    c6190g02 = null;
                                }
                                c6190g0Arr[2] = c6190g02;
                                String str6 = iVar2.f15402g;
                                if (str6 != null) {
                                    c6190g03 = new C6190g0(str6);
                                } else {
                                    c6190g03 = null;
                                }
                                c6190g0Arr[3] = c6190g03;
                                String str7 = iVar2.f15403h;
                                if (str7 != null) {
                                    c6190g04 = new C6190g0(str7);
                                } else {
                                    c6190g04 = null;
                                }
                                c6190g0Arr[4] = c6190g04;
                                String str8 = iVar2.f15404i;
                                if (str8 != null) {
                                    c6190g05 = new C6190g0(str8);
                                } else {
                                    c6190g05 = null;
                                }
                                c6190g0Arr[5] = c6190g05;
                                if (R4.b.X1(c6190g0Arr).contains(new C6190g0(str3))) {
                                    String str9 = iVar2.f15396a;
                                    if (AbstractC3557B.K(str9, "gpt_3.5")) {
                                        enumC6212z = EnumC6212z.f48474Y;
                                    } else if (AbstractC3557B.K(str9, "gpt_4")) {
                                        enumC6212z = EnumC6212z.f48475Z;
                                    } else {
                                        enumC6212z = EnumC6212z.f48478j0;
                                    }
                                }
                            } else if (n.a2(str3, ':')) {
                                enumC6212z = EnumC6212z.f48477i0;
                            } else {
                                enumC6212z = EnumC6212z.f48476h0;
                            }
                        }
                        EnumC6212z enumC6212z4 = enumC6212z;
                        o oVar = lVar.f15414g;
                        if (oVar != null) {
                            uVar = oVar.a();
                        } else {
                            uVar = null;
                        }
                        arrayList2.add(new Sc.n(enumC6212z4, lVar.f15408a, lVar.f15409b, lVar.f15410c, lVar.f15411d, lVar.f15412e, lVar.f15413f, uVar));
                    }
                    return new Vc.w(new Sc.w(arrayList, arrayList2));
                } else if ((xVar instanceof q) || (xVar instanceof r)) {
                    return xVar;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        c6388a = new C6388a(this, abstractC4825e);
        Object obj2 = c6388a.f49779Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c6388a.f49781h0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
    }
}
