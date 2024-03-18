package Nh;

import android.gov.nist.core.Separators;
import io.sentry.android.core.z;
import m.C4528h;

/* loaded from: classes2.dex */
public class d extends io.sentry.vendor.b {

    /* renamed from: A  reason: collision with root package name */
    public int f13015A;

    /* renamed from: B  reason: collision with root package name */
    public int f13016B;

    /* renamed from: C  reason: collision with root package name */
    public I5.h f13017C;

    /* renamed from: D  reason: collision with root package name */
    public int f13018D;

    /* renamed from: E  reason: collision with root package name */
    public I5.h f13019E;

    /* renamed from: F  reason: collision with root package name */
    public o f13020F;

    /* renamed from: G  reason: collision with root package name */
    public o f13021G;

    /* renamed from: H  reason: collision with root package name */
    public z f13022H;

    /* renamed from: I  reason: collision with root package name */
    public int f13023I;

    /* renamed from: d  reason: collision with root package name */
    public int f13024d;

    /* renamed from: e  reason: collision with root package name */
    public final q f13025e;

    /* renamed from: f  reason: collision with root package name */
    public int f13026f;

    /* renamed from: g  reason: collision with root package name */
    public int f13027g;

    /* renamed from: h  reason: collision with root package name */
    public int f13028h;

    /* renamed from: i  reason: collision with root package name */
    public int f13029i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f13030j;

    /* renamed from: k  reason: collision with root package name */
    public h f13031k;

    /* renamed from: l  reason: collision with root package name */
    public h f13032l;

    /* renamed from: m  reason: collision with root package name */
    public m f13033m;

    /* renamed from: n  reason: collision with root package name */
    public m f13034n;

    /* renamed from: o  reason: collision with root package name */
    public int f13035o;

    /* renamed from: p  reason: collision with root package name */
    public I5.h f13036p;

    /* renamed from: q  reason: collision with root package name */
    public int f13037q;

    /* renamed from: r  reason: collision with root package name */
    public int f13038r;

    /* renamed from: s  reason: collision with root package name */
    public int f13039s;

    /* renamed from: t  reason: collision with root package name */
    public int f13040t;

    /* renamed from: u  reason: collision with root package name */
    public I5.h f13041u;

    /* renamed from: v  reason: collision with root package name */
    public a f13042v;

    /* renamed from: w  reason: collision with root package name */
    public a f13043w;

    /* renamed from: x  reason: collision with root package name */
    public a f13044x;

    /* renamed from: y  reason: collision with root package name */
    public a f13045y;

    /* renamed from: z  reason: collision with root package name */
    public n f13046z;

    public d(b bVar, int i10) {
        super(589824, 2);
        q qVar;
        if (bVar == null) {
            qVar = new q(this);
        } else {
            qVar = new q(this, bVar);
        }
        this.f13025e = qVar;
        if ((i10 & 2) != 0) {
            this.f13023I = 4;
        } else if ((i10 & 1) != 0) {
            this.f13023I = 1;
        } else {
            this.f13023I = 0;
        }
    }

    public String A(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (!cls.isInterface() && !cls2.isInterface()) {
                    do {
                        cls = cls.getSuperclass();
                    } while (!cls.isAssignableFrom(cls2));
                    return cls.getName().replace('.', '/');
                }
                return "java/lang/Object";
            } catch (ClassNotFoundException e10) {
                throw new TypeNotPresentException(str2, e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new TypeNotPresentException(str, e11);
        }
    }

    public final byte[] B(byte[] bArr, boolean z10) {
        int i10;
        C4528h c4528h = new C4528h(12);
        c4528h.h(this.f13022H);
        for (h hVar = this.f13031k; hVar != null; hVar = (h) ((io.sentry.vendor.b) hVar.f34788c)) {
            c4528h.h(hVar.f13080n);
        }
        for (m mVar = this.f13033m; mVar != null; mVar = (m) mVar.f13110Z) {
            c4528h.h(mVar.f13127Q0);
            c4528h.h(null);
        }
        for (o oVar = this.f13020F; oVar != null; oVar = (o) ((io.sentry.vendor.b) oVar.f34788c)) {
            c4528h.h(oVar.f13186l);
        }
        int i11 = c4528h.f38769Y;
        z[] zVarArr = new z[i11];
        int i12 = 0;
        System.arraycopy((z[]) c4528h.f38770Z, 0, zVarArr, 0, i11);
        this.f13031k = null;
        this.f13032l = null;
        this.f13033m = null;
        this.f13034n = null;
        this.f13042v = null;
        this.f13043w = null;
        this.f13044x = null;
        this.f13045y = null;
        this.f13046z = null;
        this.f13015A = 0;
        this.f13016B = 0;
        this.f13017C = null;
        this.f13018D = 0;
        this.f13019E = null;
        this.f13020F = null;
        this.f13021G = null;
        this.f13022H = null;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        this.f13023I = i10;
        b bVar = new b(bArr, false);
        if (z10) {
            i12 = 8;
        }
        bVar.a(this, zVarArr, i12 | 256);
        return C();
    }

    public final byte[] C() {
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i12;
        String str8;
        String str9;
        String str10;
        String str11;
        int i13;
        int i14;
        int i15;
        q qVar;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        int i18;
        q qVar2;
        String str12;
        boolean z12;
        boolean z13;
        String str13;
        String str14;
        String str15;
        String str16;
        int i19;
        String str17;
        String str18;
        int i20;
        String str19;
        boolean z14;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str20;
        int i30;
        d dVar = this;
        int i31 = (dVar.f13029i * 2) + 24;
        h hVar = dVar.f13031k;
        int i32 = 0;
        while (true) {
            str = "ConstantValue";
            if (hVar == null) {
                break;
            }
            i32++;
            int i33 = hVar.f13075i;
            q qVar3 = hVar.f13070d;
            if (i33 != 0) {
                qVar3.j(str);
                i30 = 16;
            } else {
                i30 = 8;
            }
            int A10 = a.A(hVar.f13076j, hVar.f13077k, hVar.f13078l, hVar.f13079m) + z.b(qVar3, hVar.f13071e, hVar.f13074h) + i30;
            z zVar = hVar.f13080n;
            if (zVar != null) {
                d dVar2 = qVar3.f13196a;
                int i34 = 0;
                while (zVar != null) {
                    qVar3.j((String) zVar.f34263Y);
                    i34 += ((byte[]) zVar.f34264Z).length + 6;
                    zVar = (z) zVar.f34265h0;
                }
                A10 += i34;
            }
            i31 += A10;
            hVar = (h) ((io.sentry.vendor.b) hVar.f34788c);
        }
        m mVar = dVar.f13033m;
        int i35 = 0;
        while (true) {
            String str21 = "LocalVariableTypeTable";
            String str22 = "LocalVariableTable";
            String str23 = "Code";
            String str24 = str;
            int i36 = i32;
            if (mVar != null) {
                int i37 = i35 + 1;
                if (mVar.f13140e1 != 0) {
                    i28 = mVar.f13141f1 + 6;
                    i26 = i31;
                    i27 = i37;
                } else {
                    I5.h hVar2 = mVar.f13150p0;
                    i27 = i37;
                    int i38 = hVar2.f8084c;
                    q qVar4 = mVar.f13142h0;
                    i26 = i31;
                    if (i38 > 0) {
                        if (i38 <= 65535) {
                            qVar4.j(str23);
                            int i39 = hVar2.f8084c + 16;
                            int i40 = 0;
                            for (q.r rVar = mVar.f13151q0; rVar != null; rVar = (q.r) rVar.f43542g) {
                                i40++;
                            }
                            int i41 = (i40 * 8) + 2 + i39 + 8;
                            if (mVar.f13160z0 != null) {
                                if (qVar4.f13198c < 50) {
                                    str20 = "StackMap";
                                } else {
                                    str20 = "StackMapTable";
                                }
                                qVar4.j(str20);
                                i41 += mVar.f13160z0.f8084c + 8;
                            }
                            if (mVar.f13154t0 != null) {
                                qVar4.j("LineNumberTable");
                                i41 += mVar.f13154t0.f8084c + 8;
                            }
                            if (mVar.f13156v0 != null) {
                                qVar4.j(str22);
                                i41 += mVar.f13156v0.f8084c + 8;
                            }
                            if (mVar.f13158x0 != null) {
                                qVar4.j(str21);
                                i41 += mVar.f13158x0.f8084c + 8;
                            }
                            a aVar = mVar.f13111A0;
                            if (aVar != null) {
                                i41 += aVar.B("RuntimeVisibleTypeAnnotations");
                            }
                            a aVar2 = mVar.f13112B0;
                            if (aVar2 != null) {
                                i29 = aVar2.B("RuntimeInvisibleTypeAnnotations") + i41;
                            } else {
                                i29 = i41;
                            }
                        } else {
                            StringBuilder s10 = android.gov.nist.core.a.s("Method too large: ", qVar4.f13199d, Separators.DOT);
                            s10.append(mVar.f13145k0);
                            s10.append(Separators.SP);
                            s10.append(mVar.f13147m0);
                            throw new IndexOutOfBoundsException(s10.toString());
                        }
                    } else {
                        i29 = 8;
                    }
                    int i42 = mVar.f13113C0;
                    if (i42 > 0) {
                        qVar4.j("Exceptions");
                        i29 += (i42 * 2) + 8;
                    }
                    int A11 = a.A(mVar.f13116F0, mVar.f13117G0, mVar.f13122L0, mVar.f13123M0) + z.b(qVar4, mVar.f13143i0, mVar.f13115E0) + i29;
                    a[] aVarArr = mVar.f13119I0;
                    if (aVarArr != null) {
                        int i43 = mVar.f13118H0;
                        if (i43 == 0) {
                            i43 = aVarArr.length;
                        }
                        A11 += a.C("RuntimeVisibleParameterAnnotations", aVarArr, i43);
                    }
                    a[] aVarArr2 = mVar.f13121K0;
                    if (aVarArr2 != null) {
                        int i44 = mVar.f13120J0;
                        if (i44 == 0) {
                            i44 = aVarArr2.length;
                        }
                        A11 += a.C("RuntimeInvisibleParameterAnnotations", aVarArr2, i44);
                    }
                    if (mVar.f13124N0 != null) {
                        qVar4.j("AnnotationDefault");
                        A11 += mVar.f13124N0.f8084c + 6;
                    }
                    if (mVar.f13126P0 != null) {
                        qVar4.j("MethodParameters");
                        A11 += mVar.f13126P0.f8084c + 7;
                    }
                    z zVar2 = mVar.f13127Q0;
                    if (zVar2 != null) {
                        d dVar3 = qVar4.f13196a;
                        int i45 = 0;
                        while (zVar2 != null) {
                            qVar4.j((String) zVar2.f34263Y);
                            i45 += ((byte[]) zVar2.f34264Z).length + 6;
                            zVar2 = (z) zVar2.f34265h0;
                        }
                        i28 = i45 + A11;
                    } else {
                        i28 = A11;
                    }
                }
                i31 = i26 + i28;
                mVar = (m) mVar.f13110Z;
                dVar = this;
                str = str24;
                i32 = i36;
                i35 = i27;
            } else {
                int i46 = i31;
                I5.h hVar3 = dVar.f13036p;
                q qVar5 = dVar.f13025e;
                if (hVar3 == null) {
                    str2 = "InnerClasses";
                    i11 = i46;
                    i10 = 0;
                } else {
                    i11 = hVar3.f8084c + 8 + i46;
                    qVar5.j("InnerClasses");
                    str2 = "InnerClasses";
                    i10 = 1;
                }
                String str25 = "MethodParameters";
                if (dVar.f13037q != 0) {
                    i10++;
                    i11 += 10;
                    qVar5.j("EnclosingMethod");
                }
                String str26 = "AnnotationDefault";
                if ((dVar.f13026f & 4096) != 0 && (dVar.f13024d & 65535) < 49) {
                    i10++;
                    i11 += 6;
                    qVar5.j("Synthetic");
                }
                if (dVar.f13039s != 0) {
                    i10++;
                    i11 += 8;
                    qVar5.j("Signature");
                }
                if (dVar.f13040t != 0) {
                    i10++;
                    i11 += 8;
                    qVar5.j("SourceFile");
                }
                I5.h hVar4 = dVar.f13041u;
                if (hVar4 != null) {
                    i10++;
                    i11 += hVar4.f8084c + 6;
                    qVar5.j("SourceDebugExtension");
                }
                if ((dVar.f13026f & 131072) != 0) {
                    i10++;
                    i11 += 6;
                    qVar5.j("Deprecated");
                }
                a aVar3 = dVar.f13042v;
                if (aVar3 == null) {
                    str3 = "Deprecated";
                } else {
                    i10++;
                    str3 = "Deprecated";
                    i11 += aVar3.B("RuntimeVisibleAnnotations");
                }
                a aVar4 = dVar.f13043w;
                if (aVar4 != null) {
                    i10++;
                    i11 += aVar4.B("RuntimeInvisibleAnnotations");
                }
                a aVar5 = dVar.f13044x;
                if (aVar5 != null) {
                    i10++;
                    i11 += aVar5.B("RuntimeVisibleTypeAnnotations");
                }
                a aVar6 = dVar.f13045y;
                if (aVar6 != null) {
                    i10++;
                    i11 += aVar6.B("RuntimeInvisibleTypeAnnotations");
                }
                if (qVar5.f13205j == null) {
                    str4 = "Synthetic";
                } else {
                    qVar5.j("BootstrapMethods");
                    I5.h hVar5 = qVar5.f13205j;
                    str4 = "Synthetic";
                    if (hVar5.f8084c + 8 > 0) {
                        i10++;
                        if (hVar5 != null) {
                            qVar5.j("BootstrapMethods");
                            i25 = qVar5.f13205j.f8084c + 8;
                        } else {
                            i25 = 0;
                        }
                        i11 += i25;
                    }
                }
                n nVar = dVar.f13046z;
                String str27 = "ModuleMainClass";
                String str28 = "ModulePackages";
                String str29 = "RuntimeInvisibleParameterAnnotations";
                if (nVar != null) {
                    str7 = "RuntimeVisibleParameterAnnotations";
                    if (nVar.f13175r > 0) {
                        i23 = 1;
                    } else {
                        i23 = 0;
                    }
                    int i47 = i23 + 1;
                    if (nVar.f13177t > 0) {
                        i24 = 1;
                    } else {
                        i24 = 0;
                    }
                    i10 = i47 + i24 + i10;
                    q qVar6 = nVar.f13161d;
                    qVar6.j("Module");
                    str6 = "Module";
                    str5 = "Exceptions";
                    int i48 = nVar.f13166i.f8084c + 22 + nVar.f13168k.f8084c + nVar.f13170m.f8084c + nVar.f13172o.f8084c + nVar.f13174q.f8084c;
                    if (nVar.f13175r > 0) {
                        qVar6.j(str28);
                        i48 += nVar.f13176s.f8084c + 8;
                    }
                    if (nVar.f13177t > 0) {
                        qVar6.j(str27);
                        i48 += 8;
                    }
                    i11 += i48;
                } else {
                    str6 = "Module";
                    str7 = "RuntimeVisibleParameterAnnotations";
                    str5 = "Exceptions";
                }
                if (dVar.f13015A != 0) {
                    i10++;
                    i11 += 8;
                    qVar5.j("NestHost");
                }
                I5.h hVar6 = dVar.f13017C;
                if (hVar6 != null) {
                    i10++;
                    i12 = 8;
                    i11 += hVar6.f8084c + 8;
                    qVar5.j("NestMembers");
                } else {
                    i12 = 8;
                }
                I5.h hVar7 = dVar.f13019E;
                if (hVar7 != null) {
                    i10++;
                    i11 += hVar7.f8084c + i12;
                    qVar5.j("PermittedSubclasses");
                }
                if ((dVar.f13026f & 65536) == 0 && dVar.f13020F == null) {
                    str8 = str22;
                    str11 = str27;
                    str10 = str28;
                    str9 = str21;
                    i14 = 0;
                    i13 = 0;
                } else {
                    o oVar = dVar.f13020F;
                    i14 = 0;
                    i13 = 0;
                    while (oVar != null) {
                        int i49 = i13 + 1;
                        int i50 = oVar.f13181g;
                        q qVar7 = oVar.f13178d;
                        String str30 = str27;
                        String str31 = str28;
                        String str32 = str21;
                        String str33 = str22;
                        int A12 = a.A(oVar.f13182h, oVar.f13183i, oVar.f13184j, oVar.f13185k) + z.b(qVar7, 0, i50) + 6;
                        z zVar3 = oVar.f13186l;
                        if (zVar3 != null) {
                            d dVar4 = qVar7.f13196a;
                            int i51 = 0;
                            while (zVar3 != null) {
                                qVar7.j((String) zVar3.f34263Y);
                                i51 += ((byte[]) zVar3.f34264Z).length + 6;
                                zVar3 = (z) zVar3.f34265h0;
                            }
                            A12 += i51;
                        }
                        i14 += A12;
                        oVar = (o) ((io.sentry.vendor.b) oVar.f34788c);
                        i13 = i49;
                        str27 = str30;
                        str28 = str31;
                        str21 = str32;
                        str22 = str33;
                    }
                    str8 = str22;
                    str11 = str27;
                    str10 = str28;
                    str9 = str21;
                    i10++;
                    i11 += i14 + 8;
                    qVar5.j("Record");
                }
                z zVar4 = dVar.f13022H;
                if (zVar4 != null) {
                    i10 = zVar4.c() + i10;
                    z zVar5 = dVar.f13022H;
                    zVar5.getClass();
                    int i52 = 0;
                    while (zVar5 != null) {
                        qVar5.j((String) zVar5.f34263Y);
                        i52 += ((byte[]) zVar5.f34264Z).length + 6;
                        zVar5 = (z) zVar5.f34265h0;
                    }
                    i11 += i52;
                }
                int i53 = i10;
                int i54 = i11 + qVar5.f13203h.f8084c;
                if (qVar5.f13202g <= 65535) {
                    I5.h hVar8 = new I5.h(i54);
                    hVar8.j(-889275714);
                    hVar8.j(dVar.f13024d);
                    hVar8.k(qVar5.f13202g);
                    I5.h hVar9 = qVar5.f13203h;
                    hVar8.i(hVar9.f8083b, 0, hVar9.f8084c);
                    if ((dVar.f13024d & 65535) < 49) {
                        i15 = 4096;
                    } else {
                        i15 = 0;
                    }
                    hVar8.k((~i15) & dVar.f13026f);
                    hVar8.k(dVar.f13027g);
                    hVar8.k(dVar.f13028h);
                    hVar8.k(dVar.f13029i);
                    for (int i55 = 0; i55 < dVar.f13029i; i55++) {
                        hVar8.k(dVar.f13030j[i55]);
                    }
                    hVar8.k(i36);
                    h hVar10 = dVar.f13031k;
                    while (hVar10 != null) {
                        q qVar8 = hVar10.f13070d;
                        if (qVar8.f13198c < 49) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i21 = 4096;
                        } else {
                            i21 = 0;
                        }
                        int i56 = ~i21;
                        int i57 = hVar10.f13071e;
                        hVar8.k(i56 & i57);
                        hVar8.k(hVar10.f13072f);
                        hVar8.k(hVar10.f13073g);
                        int i58 = hVar10.f13075i;
                        if (i58 != 0) {
                            i22 = 1;
                        } else {
                            i22 = 0;
                        }
                        int i59 = i13;
                        if ((i57 & 4096) != 0 && z14) {
                            i22++;
                        }
                        int i60 = hVar10.f13074h;
                        if (i60 != 0) {
                            i22++;
                        }
                        if ((i57 & 131072) != 0) {
                            i22++;
                        }
                        if (hVar10.f13076j != null) {
                            i22++;
                        }
                        if (hVar10.f13077k != null) {
                            i22++;
                        }
                        if (hVar10.f13078l != null) {
                            i22++;
                        }
                        if (hVar10.f13079m != null) {
                            i22++;
                        }
                        z zVar6 = hVar10.f13080n;
                        if (zVar6 != null) {
                            i22 = zVar6.c() + i22;
                        }
                        hVar8.k(i22);
                        String str34 = str24;
                        int i61 = i14;
                        if (i58 != 0) {
                            hVar8.k(qVar8.j(str34));
                            hVar8.j(2);
                            hVar8.k(i58);
                        }
                        z.e(qVar8, i57, i60, hVar8);
                        a.G(hVar10.f13070d, hVar10.f13076j, hVar10.f13077k, hVar10.f13078l, hVar10.f13079m, hVar8);
                        z zVar7 = hVar10.f13080n;
                        if (zVar7 != null) {
                            while (zVar7 != null) {
                                byte[] bArr = (byte[]) zVar7.f34264Z;
                                int length = bArr.length;
                                hVar8.k(qVar8.j((String) zVar7.f34263Y));
                                hVar8.j(length);
                                hVar8.i(bArr, 0, length);
                                zVar7 = (z) zVar7.f34265h0;
                            }
                        }
                        hVar10 = (h) ((io.sentry.vendor.b) hVar10.f34788c);
                        i14 = i61;
                        str24 = str34;
                        i13 = i59;
                    }
                    int i62 = i14;
                    int i63 = i13;
                    hVar8.k(i35);
                    m mVar2 = dVar.f13033m;
                    boolean z15 = false;
                    boolean z16 = false;
                    while (mVar2 != null) {
                        if (mVar2.f13159y0 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z17 = z16 | z10;
                        boolean z18 = z15 | mVar2.f13138c1;
                        q qVar9 = mVar2.f13142h0;
                        if (qVar9.f13198c < 49) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i18 = 4096;
                        } else {
                            i18 = 0;
                        }
                        int i64 = ~i18;
                        int i65 = mVar2.f13143i0;
                        hVar8.k(i64 & i65);
                        hVar8.k(mVar2.f13144j0);
                        hVar8.k(mVar2.f13146l0);
                        int i66 = mVar2.f13140e1;
                        if (i66 != 0) {
                            hVar8.i(qVar9.f13197b.f13009b, i66, mVar2.f13141f1);
                            qVar2 = qVar5;
                            z13 = z18;
                            z12 = z17;
                            str13 = str25;
                            str14 = str26;
                            str15 = str29;
                            str16 = str9;
                            str12 = str23;
                        } else {
                            I5.h hVar11 = mVar2.f13150p0;
                            z13 = z18;
                            if (hVar11.f8084c > 0) {
                                i19 = 1;
                            } else {
                                i19 = 0;
                            }
                            int i67 = mVar2.f13113C0;
                            if (i67 > 0) {
                                i19++;
                            }
                            z12 = z17;
                            if ((i65 & 4096) != 0 && z11) {
                                i19++;
                            }
                            int i68 = mVar2.f13115E0;
                            if (i68 != 0) {
                                i19++;
                            }
                            if ((i65 & 131072) != 0) {
                                i19++;
                            }
                            if (mVar2.f13116F0 != null) {
                                i19++;
                            }
                            if (mVar2.f13117G0 != null) {
                                i19++;
                            }
                            if (mVar2.f13119I0 != null) {
                                i19++;
                            }
                            if (mVar2.f13121K0 != null) {
                                i19++;
                            }
                            if (mVar2.f13122L0 != null) {
                                i19++;
                            }
                            if (mVar2.f13123M0 != null) {
                                i19++;
                            }
                            if (mVar2.f13124N0 != null) {
                                i19++;
                            }
                            if (mVar2.f13126P0 != null) {
                                i19++;
                            }
                            z zVar8 = mVar2.f13127Q0;
                            if (zVar8 != null) {
                                i19 += zVar8.c();
                            }
                            hVar8.k(i19);
                            int i69 = hVar11.f8084c;
                            if (i69 > 0) {
                                int i70 = i69 + 10;
                                int i71 = 0;
                                for (q.r rVar2 = mVar2.f13151q0; rVar2 != null; rVar2 = (q.r) rVar2.f43542g) {
                                    i71++;
                                }
                                int i72 = (i71 * 8) + 2 + i70;
                                I5.h hVar12 = mVar2.f13160z0;
                                if (hVar12 != null) {
                                    i72 = hVar12.f8084c + 8 + i72;
                                    i20 = 1;
                                } else {
                                    i20 = 0;
                                }
                                I5.h hVar13 = mVar2.f13154t0;
                                if (hVar13 != null) {
                                    i72 = hVar13.f8084c + 8 + i72;
                                    i20++;
                                }
                                I5.h hVar14 = mVar2.f13156v0;
                                if (hVar14 != null) {
                                    i72 = hVar14.f8084c + 8 + i72;
                                    i20++;
                                }
                                I5.h hVar15 = mVar2.f13158x0;
                                if (hVar15 != null) {
                                    i72 = hVar15.f8084c + 8 + i72;
                                    i20++;
                                }
                                a aVar7 = mVar2.f13111A0;
                                if (aVar7 != null) {
                                    i72 = aVar7.B("RuntimeVisibleTypeAnnotations") + i72;
                                    i20++;
                                }
                                a aVar8 = mVar2.f13112B0;
                                if (aVar8 != null) {
                                    i72 = aVar8.B("RuntimeInvisibleTypeAnnotations") + i72;
                                    i20++;
                                }
                                qVar2 = qVar5;
                                hVar8.k(qVar9.j(str23));
                                hVar8.j(i72);
                                hVar8.k(mVar2.f13148n0);
                                hVar8.k(mVar2.f13149o0);
                                hVar8.j(hVar11.f8084c);
                                hVar8.i(hVar11.f8083b, 0, hVar11.f8084c);
                                q.r rVar3 = mVar2.f13151q0;
                                int i73 = 0;
                                for (q.r rVar4 = rVar3; rVar4 != null; rVar4 = (q.r) rVar4.f43542g) {
                                    i73++;
                                }
                                hVar8.k(i73);
                                while (rVar3 != null) {
                                    hVar8.k(((k) rVar3.f43538c).f13099d);
                                    hVar8.k(((k) rVar3.f43539d).f13099d);
                                    hVar8.k(((k) rVar3.f43540e).f13099d);
                                    hVar8.k(rVar3.f43537b);
                                    rVar3 = (q.r) rVar3.f43542g;
                                }
                                hVar8.k(i20);
                                if (mVar2.f13160z0 != null) {
                                    if (qVar9.f13198c < 50) {
                                        str19 = "StackMap";
                                    } else {
                                        str19 = "StackMapTable";
                                    }
                                    hVar8.k(qVar9.j(str19));
                                    hVar8.j(mVar2.f13160z0.f8084c + 2);
                                    hVar8.k(mVar2.f13159y0);
                                    I5.h hVar16 = mVar2.f13160z0;
                                    hVar8.i(hVar16.f8083b, 0, hVar16.f8084c);
                                }
                                if (mVar2.f13154t0 != null) {
                                    hVar8.k(qVar9.j("LineNumberTable"));
                                    hVar8.j(mVar2.f13154t0.f8084c + 2);
                                    hVar8.k(mVar2.f13153s0);
                                    I5.h hVar17 = mVar2.f13154t0;
                                    hVar8.i(hVar17.f8083b, 0, hVar17.f8084c);
                                }
                                if (mVar2.f13156v0 != null) {
                                    str17 = str8;
                                    hVar8.k(qVar9.j(str17));
                                    hVar8.j(mVar2.f13156v0.f8084c + 2);
                                    hVar8.k(mVar2.f13155u0);
                                    I5.h hVar18 = mVar2.f13156v0;
                                    hVar8.i(hVar18.f8083b, 0, hVar18.f8084c);
                                } else {
                                    str17 = str8;
                                }
                                if (mVar2.f13158x0 != null) {
                                    str16 = str9;
                                    hVar8.k(qVar9.j(str16));
                                    hVar8.j(mVar2.f13158x0.f8084c + 2);
                                    hVar8.k(mVar2.f13157w0);
                                    I5.h hVar19 = mVar2.f13158x0;
                                    str12 = str23;
                                    hVar8.i(hVar19.f8083b, 0, hVar19.f8084c);
                                } else {
                                    str16 = str9;
                                    str12 = str23;
                                }
                                a aVar9 = mVar2.f13111A0;
                                if (aVar9 != null) {
                                    aVar9.F(qVar9.j("RuntimeVisibleTypeAnnotations"), hVar8);
                                }
                                a aVar10 = mVar2.f13112B0;
                                if (aVar10 != null) {
                                    aVar10.F(qVar9.j("RuntimeInvisibleTypeAnnotations"), hVar8);
                                }
                            } else {
                                qVar2 = qVar5;
                                str16 = str9;
                                str17 = str8;
                                str12 = str23;
                            }
                            if (i67 > 0) {
                                String str35 = str5;
                                hVar8.k(qVar9.j(str35));
                                hVar8.j((i67 * 2) + 2);
                                hVar8.k(i67);
                                int[] iArr = mVar2.f13114D0;
                                int length2 = iArr.length;
                                int i74 = 0;
                                while (true) {
                                    str5 = str35;
                                    if (i74 >= length2) {
                                        break;
                                    }
                                    hVar8.k(iArr[i74]);
                                    i74++;
                                    str35 = str5;
                                }
                            }
                            z.e(qVar9, i65, i68, hVar8);
                            a.G(mVar2.f13142h0, mVar2.f13116F0, mVar2.f13117G0, mVar2.f13122L0, mVar2.f13123M0, hVar8);
                            if (mVar2.f13119I0 != null) {
                                str18 = str7;
                                int j6 = qVar9.j(str18);
                                a[] aVarArr3 = mVar2.f13119I0;
                                int i75 = mVar2.f13118H0;
                                if (i75 == 0) {
                                    i75 = aVarArr3.length;
                                }
                                a.H(j6, aVarArr3, i75, hVar8);
                            } else {
                                str18 = str7;
                            }
                            str15 = str29;
                            if (mVar2.f13121K0 != null) {
                                int j10 = qVar9.j(str15);
                                a[] aVarArr4 = mVar2.f13121K0;
                                int i76 = mVar2.f13120J0;
                                if (i76 == 0) {
                                    i76 = aVarArr4.length;
                                }
                                a.H(j10, aVarArr4, i76, hVar8);
                            }
                            str14 = str26;
                            if (mVar2.f13124N0 != null) {
                                hVar8.k(qVar9.j(str14));
                                hVar8.j(mVar2.f13124N0.f8084c);
                                I5.h hVar20 = mVar2.f13124N0;
                                hVar8.i(hVar20.f8083b, 0, hVar20.f8084c);
                            }
                            if (mVar2.f13126P0 != null) {
                                str13 = str25;
                                hVar8.k(qVar9.j(str13));
                                hVar8.j(mVar2.f13126P0.f8084c + 1);
                                hVar8.h(mVar2.f13125O0);
                                I5.h hVar21 = mVar2.f13126P0;
                                str7 = str18;
                                hVar8.i(hVar21.f8083b, 0, hVar21.f8084c);
                            } else {
                                str7 = str18;
                                str13 = str25;
                            }
                            z zVar9 = mVar2.f13127Q0;
                            if (zVar9 != null) {
                                while (zVar9 != null) {
                                    byte[] bArr2 = (byte[]) zVar9.f34264Z;
                                    int length3 = bArr2.length;
                                    hVar8.k(qVar9.j((String) zVar9.f34263Y));
                                    hVar8.j(length3);
                                    hVar8.i(bArr2, 0, length3);
                                    zVar9 = (z) zVar9.f34265h0;
                                    str17 = str17;
                                }
                            }
                            str8 = str17;
                        }
                        mVar2 = (m) mVar2.f13110Z;
                        str29 = str15;
                        str26 = str14;
                        str25 = str13;
                        z15 = z13;
                        z16 = z12;
                        str23 = str12;
                        qVar5 = qVar2;
                        str9 = str16;
                    }
                    q qVar10 = qVar5;
                    hVar8.k(i53);
                    if (dVar.f13036p != null) {
                        qVar = qVar10;
                        hVar8.k(qVar.j(str2));
                        hVar8.j(dVar.f13036p.f8084c + 2);
                        hVar8.k(dVar.f13035o);
                        I5.h hVar22 = dVar.f13036p;
                        hVar8.i(hVar22.f8083b, 0, hVar22.f8084c);
                    } else {
                        qVar = qVar10;
                    }
                    if (dVar.f13037q != 0) {
                        hVar8.k(qVar.j("EnclosingMethod"));
                        hVar8.j(4);
                        hVar8.k(dVar.f13037q);
                        hVar8.k(dVar.f13038r);
                    }
                    if ((dVar.f13026f & 4096) != 0 && (dVar.f13024d & 65535) < 49) {
                        hVar8.k(qVar.j(str4));
                        hVar8.j(0);
                    }
                    if (dVar.f13039s != 0) {
                        hVar8.k(qVar.j("Signature"));
                        i16 = 2;
                        hVar8.j(2);
                        hVar8.k(dVar.f13039s);
                    } else {
                        i16 = 2;
                    }
                    if (dVar.f13040t != 0) {
                        hVar8.k(qVar.j("SourceFile"));
                        hVar8.j(i16);
                        hVar8.k(dVar.f13040t);
                    }
                    I5.h hVar23 = dVar.f13041u;
                    if (hVar23 != null) {
                        int i77 = hVar23.f8084c;
                        hVar8.k(qVar.j("SourceDebugExtension"));
                        hVar8.j(i77);
                        i17 = 0;
                        hVar8.i(dVar.f13041u.f8083b, 0, i77);
                    } else {
                        i17 = 0;
                    }
                    if ((dVar.f13026f & 131072) != 0) {
                        hVar8.k(qVar.j(str3));
                        hVar8.j(i17);
                    }
                    a.G(dVar.f13025e, dVar.f13042v, dVar.f13043w, dVar.f13044x, dVar.f13045y, hVar8);
                    if (qVar.f13205j != null) {
                        hVar8.k(qVar.j("BootstrapMethods"));
                        hVar8.j(qVar.f13205j.f8084c + 2);
                        hVar8.k(qVar.f13204i);
                        I5.h hVar24 = qVar.f13205j;
                        hVar8.i(hVar24.f8083b, 0, hVar24.f8084c);
                    }
                    n nVar2 = dVar.f13046z;
                    if (nVar2 != null) {
                        I5.h hVar25 = nVar2.f13166i;
                        I5.h hVar26 = nVar2.f13168k;
                        int i78 = hVar25.f8084c + 16 + hVar26.f8084c;
                        I5.h hVar27 = nVar2.f13170m;
                        int i79 = i78 + hVar27.f8084c;
                        I5.h hVar28 = nVar2.f13172o;
                        int i80 = i79 + hVar28.f8084c;
                        I5.h hVar29 = nVar2.f13174q;
                        int i81 = i80 + hVar29.f8084c;
                        q qVar11 = nVar2.f13161d;
                        hVar8.k(qVar11.j(str6));
                        hVar8.j(i81);
                        hVar8.k(nVar2.f13162e);
                        hVar8.k(nVar2.f13163f);
                        hVar8.k(nVar2.f13164g);
                        hVar8.k(nVar2.f13165h);
                        hVar8.i(hVar25.f8083b, 0, hVar25.f8084c);
                        hVar8.k(nVar2.f13167j);
                        hVar8.i(hVar26.f8083b, 0, hVar26.f8084c);
                        hVar8.k(nVar2.f13169l);
                        hVar8.i(hVar27.f8083b, 0, hVar27.f8084c);
                        hVar8.k(nVar2.f13171n);
                        hVar8.i(hVar28.f8083b, 0, hVar28.f8084c);
                        hVar8.k(nVar2.f13173p);
                        hVar8.i(hVar29.f8083b, 0, hVar29.f8084c);
                        if (nVar2.f13175r > 0) {
                            hVar8.k(qVar11.j(str10));
                            I5.h hVar30 = nVar2.f13176s;
                            hVar8.j(hVar30.f8084c + 2);
                            hVar8.k(nVar2.f13175r);
                            hVar8.i(hVar30.f8083b, 0, hVar30.f8084c);
                        }
                        if (nVar2.f13177t > 0) {
                            hVar8.k(qVar11.j(str11));
                            hVar8.j(2);
                            hVar8.k(nVar2.f13177t);
                        }
                    }
                    if (dVar.f13015A != 0) {
                        hVar8.k(qVar.j("NestHost"));
                        hVar8.j(2);
                        hVar8.k(dVar.f13015A);
                    }
                    if (dVar.f13017C != null) {
                        hVar8.k(qVar.j("NestMembers"));
                        hVar8.j(dVar.f13017C.f8084c + 2);
                        hVar8.k(dVar.f13016B);
                        I5.h hVar31 = dVar.f13017C;
                        hVar8.i(hVar31.f8083b, 0, hVar31.f8084c);
                    }
                    if (dVar.f13019E != null) {
                        hVar8.k(qVar.j("PermittedSubclasses"));
                        hVar8.j(dVar.f13019E.f8084c + 2);
                        hVar8.k(dVar.f13018D);
                        I5.h hVar32 = dVar.f13019E;
                        hVar8.i(hVar32.f8083b, 0, hVar32.f8084c);
                    }
                    if ((dVar.f13026f & 65536) != 0 || dVar.f13020F != null) {
                        hVar8.k(qVar.j("Record"));
                        hVar8.j(i62 + 2);
                        hVar8.k(i63);
                        for (o oVar2 = dVar.f13020F; oVar2 != null; oVar2 = (o) ((io.sentry.vendor.b) oVar2.f34788c)) {
                            oVar2.A(hVar8);
                        }
                    }
                    z zVar10 = dVar.f13022H;
                    if (zVar10 != null) {
                        while (zVar10 != null) {
                            byte[] bArr3 = (byte[]) zVar10.f34264Z;
                            int length4 = bArr3.length;
                            hVar8.k(qVar.j((String) zVar10.f34263Y));
                            hVar8.j(length4);
                            hVar8.i(bArr3, 0, length4);
                            zVar10 = (z) zVar10.f34265h0;
                        }
                    }
                    if (z15) {
                        return dVar.B(hVar8.f8083b, z16);
                    }
                    return hVar8.f8083b;
                }
                throw new IndexOutOfBoundsException(R.a.r("Class too large: ", qVar5.f13199d));
            }
        }
    }

    @Override // io.sentry.vendor.b
    public final void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        int i12;
        this.f13024d = i10;
        this.f13026f = i11;
        int i13 = i10 & 65535;
        q qVar = this.f13025e;
        qVar.f13198c = i13;
        qVar.f13199d = str;
        this.f13027g = qVar.k(7, str).f13187a;
        if (str2 != null) {
            this.f13039s = qVar.j(str2);
        }
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = qVar.k(7, str3).f13187a;
        }
        this.f13028h = i12;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f13029i = length;
            this.f13030j = new int[length];
            for (int i14 = 0; i14 < this.f13029i; i14++) {
                this.f13030j[i14] = qVar.k(7, strArr[i14]).f13187a;
            }
        }
        if (this.f13023I == 1 && i13 >= 51) {
            this.f13023I = 2;
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b d(String str, boolean z10) {
        q qVar = this.f13025e;
        if (z10) {
            a E10 = a.E(qVar, str, this.f13042v);
            this.f13042v = E10;
            return E10;
        }
        a E11 = a.E(qVar, str, this.f13043w);
        this.f13043w = E11;
        return E11;
    }

    @Override // io.sentry.vendor.b
    public final void f(z zVar) {
        zVar.f34265h0 = this.f13022H;
        this.f13022H = zVar;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b j(int i10, Object obj, String str, String str2, String str3) {
        h hVar = new h(this.f13025e, i10, str, str2, str3, obj);
        if (this.f13031k == null) {
            this.f13031k = hVar;
        } else {
            this.f13032l.f34788c = hVar;
        }
        this.f13032l = hVar;
        return hVar;
    }

    @Override // io.sentry.vendor.b
    public final void k(String str, int i10, String str2, String str3) {
        int i11;
        if (this.f13036p == null) {
            this.f13036p = new I5.h();
        }
        q qVar = this.f13025e;
        p k10 = qVar.k(7, str);
        if (k10.f13193g == 0) {
            this.f13035o++;
            this.f13036p.k(k10.f13187a);
            I5.h hVar = this.f13036p;
            int i12 = 0;
            if (str2 == null) {
                i11 = 0;
            } else {
                i11 = qVar.k(7, str2).f13187a;
            }
            hVar.k(i11);
            I5.h hVar2 = this.f13036p;
            if (str3 != null) {
                i12 = qVar.j(str3);
            }
            hVar2.k(i12);
            this.f13036p.k(i10);
            k10.f13193g = this.f13035o;
        }
    }

    @Override // io.sentry.vendor.b
    public final l m(int i10, String str, String str2, String str3, String[] strArr) {
        m mVar = new m(this.f13025e, i10, str, str2, str3, strArr, this.f13023I);
        if (this.f13033m == null) {
            this.f13033m = mVar;
        } else {
            this.f13034n.f13110Z = mVar;
        }
        this.f13034n = mVar;
        return mVar;
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b n(int i10, String str, String str2) {
        int i11;
        q qVar = this.f13025e;
        p k10 = qVar.k(19, str);
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = qVar.j(str2);
        }
        n nVar = new n(qVar, k10.f13187a, i10, i11);
        this.f13046z = nVar;
        return nVar;
    }

    @Override // io.sentry.vendor.b
    public final void o(String str) {
        this.f13015A = this.f13025e.k(7, str).f13187a;
    }

    @Override // io.sentry.vendor.b
    public final void p(String str) {
        if (this.f13017C == null) {
            this.f13017C = new I5.h();
        }
        this.f13016B++;
        this.f13017C.k(this.f13025e.k(7, str).f13187a);
    }

    @Override // io.sentry.vendor.b
    public final void r(String str, String str2, String str3) {
        q qVar = this.f13025e;
        this.f13037q = qVar.k(7, str).f13187a;
        if (str2 != null && str3 != null) {
            this.f13038r = qVar.i(str2, str3);
        }
    }

    @Override // io.sentry.vendor.b
    public final void t(String str) {
        if (this.f13019E == null) {
            this.f13019E = new I5.h();
        }
        this.f13018D++;
        this.f13019E.k(this.f13025e.k(7, str).f13187a);
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b v(String str, String str2, String str3) {
        o oVar = new o(this.f13025e, str, str2, str3);
        if (this.f13020F == null) {
            this.f13020F = oVar;
        } else {
            this.f13021G.f34788c = oVar;
        }
        this.f13021G = oVar;
        return oVar;
    }

    @Override // io.sentry.vendor.b
    public final void x(String str, String str2) {
        if (str != null) {
            this.f13040t = this.f13025e.j(str);
        }
        if (str2 != null) {
            I5.h hVar = new I5.h();
            hVar.a(0, Integer.MAX_VALUE, str2);
            this.f13041u = hVar;
        }
    }

    @Override // io.sentry.vendor.b
    public final io.sentry.vendor.b y(int i10, I5.h hVar, String str, boolean z10) {
        q qVar = this.f13025e;
        if (z10) {
            a D6 = a.D(qVar, i10, hVar, str, this.f13044x);
            this.f13044x = D6;
            return D6;
        }
        a D10 = a.D(qVar, i10, hVar, str, this.f13045y);
        this.f13045y = D10;
        return D10;
    }

    @Override // io.sentry.vendor.b
    public final void g() {
    }
}
