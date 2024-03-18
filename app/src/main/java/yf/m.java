package Yf;

import Bg.k0;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1007p;
import Mf.b0;
import Z.C1745x0;
import bg.AbstractC2198f;
import bg.AbstractC2199g;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jf.AbstractC3957g;
import jf.C3959i;
import l8.AbstractC4344b;
import sg.C5624a;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22362Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s3.z f22363Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f22364h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, s3.z zVar) {
        super(0);
        this.f22364h0 = oVar;
        this.f22363Z = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [Pf.l, Pf.x, Wf.b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Yf.o, Yf.B] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y7.b bVar;
        Object obj;
        String str;
        String str2;
        ?? emptyList;
        String str3;
        ArrayList arrayList;
        int i10;
        C3959i c3959i;
        List list;
        int i11 = this.f22362Y;
        ?? r92 = this.f22364h0;
        s3.z zVar = this.f22363Z;
        switch (i11) {
            case 0:
                Constructor<?>[] declaredConstructors = ((Sf.q) r92.f22368o).f16621a.getDeclaredConstructors();
                AbstractC3557B.b0("getDeclaredConstructors(...)", declaredConstructors);
                List p12 = Kg.m.p1(Kg.m.n1(Kg.m.i1(kf.q.R2(declaredConstructors), Sf.j.f16614Y), Sf.k.f16615Y));
                ArrayList arrayList2 = new ArrayList(p12.size());
                Iterator it = p12.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean z10 = false;
                    s3.z zVar2 = r92.f22292b;
                    AbstractC0997f abstractC0997f = r92.f22367n;
                    if (hasNext) {
                        Sf.t tVar = (Sf.t) it.next();
                        Wf.b N02 = Wf.b.N0(abstractC0997f, Bi.c.B1(zVar2, tVar), false, ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(tVar));
                        s3.z zVar3 = new s3.z((Xf.a) zVar2.f45394a, new Xf.g(zVar2, N02, tVar, abstractC0997f.o().size()), (AbstractC3957g) zVar2.f45396c);
                        Constructor constructor = tVar.f16625a;
                        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                        AbstractC3557B.Z(genericParameterTypes);
                        if (genericParameterTypes.length == 0) {
                            list = kf.v.f37483Y;
                        } else {
                            Class declaringClass = constructor.getDeclaringClass();
                            if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                                genericParameterTypes = (Type[]) kf.q.c3(1, genericParameterTypes.length, genericParameterTypes);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            if (parameterAnnotations.length >= genericParameterTypes.length) {
                                if (parameterAnnotations.length > genericParameterTypes.length) {
                                    parameterAnnotations = (Annotation[][]) kf.q.c3(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                                }
                                list = tVar.c(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                            } else {
                                throw new IllegalStateException("Illegal generic signature: " + constructor);
                            }
                        }
                        C1745x0 u10 = B.u(zVar3, N02, list);
                        List o10 = abstractC0997f.o();
                        AbstractC3557B.b0("getDeclaredTypeParameters(...)", o10);
                        ArrayList typeParameters = tVar.getTypeParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(typeParameters, 10));
                        Iterator it2 = typeParameters.iterator();
                        while (it2.hasNext()) {
                            b0 a5 = ((Xf.i) zVar3.f45395b).a((Sf.E) it2.next());
                            AbstractC3557B.Z(a5);
                            arrayList3.add(a5);
                        }
                        N02.L0((List) u10.f22768b, R4.b.h2(tVar.d()), kf.t.w2(arrayList3, o10));
                        N02.E0(false);
                        N02.F0(u10.f22767a);
                        N02.G0(abstractC0997f.n());
                        ((Cf.h) ((Xf.a) zVar3.f45394a).f21958g).getClass();
                        arrayList2.add(N02);
                    } else {
                        AbstractC2199g abstractC2199g = r92.f22368o;
                        Sf.q qVar = (Sf.q) abstractC2199g;
                        boolean f6 = qVar.f();
                        Nf.g gVar = Nf.h.f12822a;
                        if (f6) {
                            Wf.b N03 = Wf.b.N0(abstractC0997f, gVar, true, ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(abstractC2199g));
                            ArrayList e10 = ((Sf.q) abstractC2199g).e();
                            ArrayList arrayList4 = new ArrayList(e10.size());
                            Zf.a N1 = A7.b.N1(k0.f2132Z, false, false, null, 6);
                            Iterator it3 = e10.iterator();
                            int i12 = 0;
                            while (it3.hasNext()) {
                                Sf.C c10 = (Sf.C) it3.next();
                                arrayList4.add(new Pf.b0(N03, null, i12, gVar, c10.b(), ((U3.i) zVar2.f45398e).L(c10.e(), N1), false, false, false, null, ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(c10)));
                                i12++;
                                it3 = it3;
                                z10 = false;
                            }
                            N03.F0(z10);
                            AbstractC1007p visibility = abstractC0997f.getVisibility();
                            AbstractC3557B.b0("getVisibility(...)", visibility);
                            if (AbstractC3557B.K(visibility, Uf.t.f17835b)) {
                                visibility = Uf.t.f17836c;
                                AbstractC3557B.b0("PROTECTED_AND_PACKAGE", visibility);
                            }
                            N03.K0(arrayList4, visibility);
                            N03.E0(false);
                            N03.G0(abstractC0997f.n());
                            String e02 = L4.a.e0(N03, 2);
                            if (!arrayList2.isEmpty()) {
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    if (AbstractC3557B.K(L4.a.e0((AbstractC0996e) it4.next(), 2), e02)) {
                                    }
                                }
                            }
                            arrayList2.add(N03);
                            ((Cf.h) ((Xf.a) zVar.f45394a).f21958g).getClass();
                        }
                        ((C5624a) ((Xf.a) zVar.f45394a).f21975x).a(zVar, abstractC0997f, arrayList2);
                        y7.b bVar2 = ((Xf.a) zVar.f45394a).f21969r;
                        boolean isEmpty = arrayList2.isEmpty();
                        y7.b bVar3 = bVar2;
                        Collection collection = arrayList2;
                        if (isEmpty) {
                            Class cls = qVar.f16621a;
                            boolean isAnnotation = cls.isAnnotation();
                            if (!cls.isInterface()) {
                                abstractC2199g.getClass();
                            }
                            if (!isAnnotation) {
                                bVar = bVar2;
                                obj = null;
                            } else {
                                ?? N04 = Wf.b.N0(abstractC0997f, gVar, true, ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(abstractC2199g));
                                if (isAnnotation) {
                                    List c11 = ((Sf.q) abstractC2199g).c();
                                    emptyList = new ArrayList(c11.size());
                                    Zf.a N12 = A7.b.N1(k0.f2132Z, true, false, null, 6);
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj2 : c11) {
                                        if (AbstractC3557B.K(((Sf.z) obj2).b(), Uf.D.f17727b)) {
                                            arrayList5.add(obj2);
                                        } else {
                                            arrayList6.add(obj2);
                                        }
                                    }
                                    arrayList5.size();
                                    Sf.z zVar4 = (Sf.z) kf.t.h2(arrayList5);
                                    if (zVar4 != null) {
                                        Type genericReturnType = zVar4.f16629a.getGenericReturnType();
                                        AbstractC3557B.b0("getGenericReturnType(...)", genericReturnType);
                                        Sf.D g10 = Cf.h.g(genericReturnType);
                                        if (g10 instanceof AbstractC2198f) {
                                            AbstractC2198f abstractC2198f = (AbstractC2198f) g10;
                                            arrayList = arrayList6;
                                            c3959i = new C3959i(((U3.i) zVar2.f45398e).K(abstractC2198f, N12, true), ((U3.i) zVar2.f45398e).L(((Sf.i) abstractC2198f).f16612b, N12));
                                        } else {
                                            arrayList = arrayList6;
                                            c3959i = new C3959i(((U3.i) zVar2.f45398e).L(g10, N12), null);
                                        }
                                        str3 = "getGenericReturnType(...)";
                                        str = "getVisibility(...)";
                                        bVar = bVar2;
                                        str2 = "PROTECTED_AND_PACKAGE";
                                        r92.x(emptyList, N04, 0, zVar4, (Bg.A) c3959i.f36155Y, (Bg.A) c3959i.f36156Z);
                                    } else {
                                        bVar = bVar2;
                                        arrayList = arrayList6;
                                        str3 = "getGenericReturnType(...)";
                                        str = "getVisibility(...)";
                                        str2 = "PROTECTED_AND_PACKAGE";
                                    }
                                    if (zVar4 != null) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                    Iterator it5 = arrayList.iterator();
                                    int i13 = 0;
                                    while (it5.hasNext()) {
                                        Sf.z zVar5 = (Sf.z) it5.next();
                                        Type genericReturnType2 = zVar5.f16629a.getGenericReturnType();
                                        String str4 = str3;
                                        AbstractC3557B.b0(str4, genericReturnType2);
                                        r92.x(emptyList, N04, i13 + i10, zVar5, ((U3.i) zVar2.f45398e).L(Cf.h.g(genericReturnType2), N12), null);
                                        i13++;
                                        str3 = str4;
                                    }
                                } else {
                                    bVar = bVar2;
                                    str = "getVisibility(...)";
                                    str2 = "PROTECTED_AND_PACKAGE";
                                    emptyList = Collections.emptyList();
                                }
                                N04.F0(false);
                                AbstractC1007p visibility2 = abstractC0997f.getVisibility();
                                AbstractC3557B.b0(str, visibility2);
                                if (AbstractC3557B.K(visibility2, Uf.t.f17835b)) {
                                    visibility2 = Uf.t.f17836c;
                                    AbstractC3557B.b0(str2, visibility2);
                                }
                                N04.K0(emptyList, visibility2);
                                N04.E0(true);
                                N04.G0(abstractC0997f.n());
                                ((Cf.h) ((Xf.a) zVar2.f45394a).f21958g).getClass();
                                obj = N04;
                            }
                            bVar3 = bVar;
                            collection = AbstractC4344b.H0(obj);
                        }
                        return kf.t.K2(bVar3.n(zVar, collection));
                    }
                }
                break;
            default:
                return kf.t.P2(((C5624a) ((Xf.a) zVar.f45394a).f21975x).f(zVar, r92.f22367n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s3.z zVar, o oVar) {
        super(0);
        this.f22363Z = zVar;
        this.f22364h0 = oVar;
    }
}
