package Xf;

import Ag.m;
import Ag.q;
import Mf.AbstractC1003l;
import Mf.b0;
import Sf.E;
import Yf.J;
import bg.AbstractC2208p;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s3.z;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public final z f21986a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1003l f21987b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21988c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f21989d;

    /* renamed from: e  reason: collision with root package name */
    public final m f21990e;

    public g(z zVar, AbstractC1003l abstractC1003l, AbstractC2208p abstractC2208p, int i10) {
        AbstractC3557B.c0("c", zVar);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("typeParameterOwner", abstractC2208p);
        this.f21986a = zVar;
        this.f21987b = abstractC1003l;
        this.f21988c = i10;
        ArrayList typeParameters = abstractC2208p.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f21989d = linkedHashMap;
        this.f21990e = ((q) this.f21986a.e()).c(new f(0, this));
    }

    @Override // Xf.i
    public final b0 a(E e10) {
        AbstractC3557B.c0("javaTypeParameter", e10);
        J j6 = (J) this.f21990e.invoke(e10);
        if (j6 == null) {
            return ((i) this.f21986a.f45395b).a(e10);
        }
        return j6;
    }
}
