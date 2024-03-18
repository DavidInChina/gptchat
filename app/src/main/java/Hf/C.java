package Hf;

import Gf.A0;
import Gf.H;
import K4.J;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1013w;
import Mf.N;
import Sf.AbstractC1385d;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class C implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Method f7684a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f7685b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f7686c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f7687d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f7688e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public C(AbstractC1013w abstractC1013w, H h10, String str, List list) {
        ?? r02;
        AbstractC3557B.c0("container", h10);
        AbstractC3557B.c0("constructorDesc", str);
        Method h11 = h10.h("constructor-impl", str);
        AbstractC3557B.Z(h11);
        this.f7684a = h11;
        Method h12 = h10.h("box-impl", Lg.n.w2(TokenNames.f24320V, str) + AbstractC1385d.b(h10.f()));
        AbstractC3557B.Z(h12);
        this.f7685b = h12;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (true) {
            List list2 = null;
            if (!it.hasNext()) {
                break;
            }
            Bg.A type = ((N) it.next()).getType();
            AbstractC3557B.b0("getType(...)", type);
            Bg.D i10 = J.i(type);
            ArrayList H6 = r.f.H(i10);
            if (H6 == null) {
                Class Y7 = r.f.Y(i10);
                if (Y7 != null) {
                    list2 = AbstractC4344b.F0(r.f.F(Y7, abstractC1013w));
                }
            } else {
                list2 = H6;
            }
            arrayList.add(list2);
        }
        this.f7686c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                AbstractC1000i k10 = ((N) obj).getType().y0().k();
                AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", k10);
                AbstractC0997f abstractC0997f = (AbstractC0997f) k10;
                List<Method> list3 = (List) this.f7686c.get(i11);
                if (list3 != null) {
                    r02 = new ArrayList(AbstractC6583a.H1(list3, 10));
                    for (Method method : list3) {
                        r02.add(method.getReturnType());
                    }
                } else {
                    Class k11 = A0.k(abstractC0997f);
                    AbstractC3557B.Z(k11);
                    r02 = AbstractC4344b.F0(k11);
                }
                arrayList2.add(r02);
                i11 = i12;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        this.f7687d = arrayList2;
        this.f7688e = AbstractC6583a.I1(arrayList2);
    }

    @Override // Hf.g
    public final List a() {
        return this.f7688e;
    }

    @Override // Hf.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // Hf.g
    public final Object call(Object[] objArr) {
        ?? r52;
        AbstractC3557B.c0("args", objArr);
        ArrayList arrayList = this.f7686c;
        AbstractC3557B.c0("other", arrayList);
        int length = objArr.length;
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC6583a.H1(arrayList, 10), length));
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 >= length) {
                break;
            }
            arrayList2.add(new C3959i(objArr[i10], next));
            i10++;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C3959i c3959i = (C3959i) it2.next();
            Object obj = c3959i.f36155Y;
            List<Method> list = (List) c3959i.f36156Z;
            if (list != null) {
                r52 = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Method method : list) {
                    r52.add(method.invoke(obj, new Object[0]));
                }
            } else {
                r52 = AbstractC4344b.F0(obj);
            }
            kf.s.N1(r52, arrayList3);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.f7684a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f7685b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // Hf.g
    public final Type getReturnType() {
        Class<?> returnType = this.f7685b.getReturnType();
        AbstractC3557B.b0("getReturnType(...)", returnType);
        return returnType;
    }
}
