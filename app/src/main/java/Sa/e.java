package Sa;

import Ad.l;
import Df.H;
import Df.w;
import Jc.AbstractC0810d;
import Jc.E;
import Jc.v;
import Qg.AbstractC1207j;
import Qg.C1198e;
import Ta.k;
import Vc.q;
import Vc.r;
import Vc.x;
import android.app.Application;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import jf.y;
import kf.t;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6174I;
import wd.C6208v;
import wd.C6209w;
import wd.L;
import wd.Y;
import wd.Z;
import wd.p0;
import wd.q0;
import wd.s0;
import wd.u0;
import wd.v0;
import wf.n;
import x8.W;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public Ic.b f16451Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f16452Z;

    /* renamed from: h0  reason: collision with root package name */
    public x f16453h0;

    /* renamed from: i0  reason: collision with root package name */
    public B f16454i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f16455j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ Object f16456k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E f16457l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ f f16458m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Uri f16459n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Uri f16460o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ String f16461p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ String f16462q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(E e10, f fVar, Uri uri, Uri uri2, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16457l0 = e10;
        this.f16458m0 = fVar;
        this.f16459n0 = uri;
        this.f16460o0 = uri2;
        this.f16461p0 = str;
        this.f16462q0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        e eVar = new e(this.f16457l0, this.f16458m0, this.f16459n0, this.f16460o0, this.f16461p0, this.f16462q0, abstractC4825e);
        eVar.f16456k0 = obj;
        return eVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0365 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0498 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b2  */
    /* JADX WARN: Type inference failed for: r4v30, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y yVar;
        p0 p0Var;
        AbstractC1207j abstractC1207j;
        Ic.b bVar;
        String str;
        EnumC5000a enumC5000a;
        x xVar;
        x xVar2;
        v0 v0Var;
        Ic.d dVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z10;
        v0 v0Var2;
        AbstractC1207j abstractC1207j2;
        Ic.b bVar2;
        x xVar3;
        B b10;
        Object obj6;
        v0 v0Var3;
        Object obj7;
        String str2;
        boolean z11;
        v0 v0Var4;
        AbstractC1207j abstractC1207j3;
        E e10;
        EnumC5000a enumC5000a2;
        v0 v0Var5;
        boolean z12;
        AutoCloseable autoCloseable;
        Throwable th2;
        Cursor cursor;
        Exception e11;
        v0 v0Var6;
        boolean z13;
        int i10;
        v0 u0Var;
        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
        int i11 = this.f16455j0;
        p0 p0Var2 = p0.f48449a;
        y yVar2 = y.f36177a;
        Throwable th3 = null;
        E e12 = this.f16457l0;
        f fVar = this.f16458m0;
        switch (i11) {
            case 0:
                N.B0(obj);
                abstractC1207j3 = (AbstractC1207j) this.f16456k0;
                Ic.e eVar = Ic.e.f8540a;
                this.f16456k0 = abstractC1207j3;
                this.f16455j0 = 1;
                if (abstractC1207j3.c(eVar, this) == enumC5000a3) {
                    return enumC5000a3;
                }
                abstractC1207j2 = abstractC1207j3;
                e10 = E.f9042i0;
                Uri uri = this.f16459n0;
                if (e12 != e10) {
                    i iVar = fVar.f16465h0;
                    iVar.getClass();
                    AbstractC3557B.c0("imageFile", uri);
                    Application application = iVar.f16478a;
                    InputStream openInputStream = application.getContentResolver().openInputStream(uri);
                    try {
                        if (openInputStream != null) {
                            T1.g gVar = new T1.g(openInputStream);
                            l.S(openInputStream, th3);
                            InputStream openInputStream2 = application.getContentResolver().openInputStream(uri);
                            try {
                                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2);
                                if (decodeStream == null) {
                                    u0Var = new s0(0, new IOException("Failed to decode bitmap"));
                                } else {
                                    int c10 = gVar.c();
                                    Matrix matrix = new Matrix();
                                    if (c10 != 3) {
                                        if (c10 != 6) {
                                            if (c10 == 8) {
                                                matrix.postRotate(270.0f);
                                            }
                                        } else {
                                            matrix.postRotate(90.0f);
                                        }
                                    } else {
                                        matrix.postRotate(180.0f);
                                    }
                                    Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
                                    AbstractC3557B.b0("createBitmap(...)", createBitmap);
                                    int i12 = 1536;
                                    if (createBitmap.getWidth() <= 1536 && createBitmap.getHeight() <= 1536) {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        AbstractC3557B.b0("toByteArray(...)", byteArray);
                                        u0Var = new u0(new h(byteArray, createBitmap.getWidth(), createBitmap.getHeight()));
                                        Throwable th4 = null;
                                    } else {
                                        if (createBitmap.getWidth() > createBitmap.getHeight()) {
                                            i10 = (createBitmap.getHeight() * 1536) / createBitmap.getWidth();
                                            z13 = true;
                                        } else {
                                            z13 = true;
                                            i12 = (createBitmap.getWidth() * 1536) / createBitmap.getHeight();
                                            i10 = 1536;
                                        }
                                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i12, i10, z13);
                                        AbstractC3557B.b0("createScaledBitmap(...)", createScaledBitmap);
                                        try {
                                            p0Var = p0Var2;
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            yVar = yVar2;
                                            enumC5000a2 = enumC5000a3;
                                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            AbstractC3557B.b0("toByteArray(...)", byteArray2);
                                            v0 u0Var2 = new u0(new h(byteArray2, i12, i10));
                                            l.S(openInputStream2, null);
                                            v0Var5 = u0Var2;
                                        } finally {
                                            createScaledBitmap.recycle();
                                        }
                                    }
                                }
                                enumC5000a2 = enumC5000a3;
                                p0Var = p0Var2;
                                yVar = yVar2;
                                v0Var5 = u0Var;
                            } finally {
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } finally {
                    }
                } else {
                    enumC5000a2 = enumC5000a3;
                    p0Var = p0Var2;
                    yVar = yVar2;
                    fVar.getClass();
                    try {
                        InputStream openInputStream3 = fVar.f16463Y.getContentResolver().openInputStream(uri);
                        if (openInputStream3 != null) {
                            byte[] n22 = AbstractC3557B.n2(openInputStream3);
                            l.S(openInputStream3, null);
                            v0Var6 = new u0(n22);
                        } else {
                            v0Var6 = new s0(1, new IOException("Unable to open stream: " + uri));
                        }
                    } catch (Exception e13) {
                        v0Var6 = new s0(1, e13);
                    }
                    if (v0Var6 instanceof u0) {
                        v0Var5 = new u0(new Ic.b((byte[]) ((u0) v0Var6).f48468a));
                    } else if ((v0Var6 instanceof p0) || (v0Var6 instanceof q0)) {
                        v0Var5 = v0Var6;
                    } else {
                        throw new RuntimeException();
                    }
                }
                z12 = v0Var5 instanceof u0;
                if (!z12) {
                    bVar2 = (Ic.b) ((u0) v0Var5).f48468a;
                    try {
                        try {
                            try {
                                cursor = fVar.f16463Y.getContentResolver().query(this.f16459n0, new String[]{"_display_name"}, null, null, null);
                                try {
                                } catch (Exception e14) {
                                    e11 = e14;
                                    AbstractC3612c.r("DocumentFile", "Failed query: " + e11);
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (RuntimeException e15) {
                                            throw e15;
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    AbstractC3557B.Z(str2);
                                    int length = bVar2.f8538a.length;
                                    this.f16456k0 = abstractC1207j2;
                                    this.f16451Y = bVar2;
                                    this.f16452Z = str2;
                                    this.f16455j0 = 3;
                                    Ta.l lVar = (Ta.l) fVar.f16464Z;
                                    lVar.getClass();
                                    Ta.g gVar2 = new Ta.g(str2, length, e12, null);
                                    w a5 = C.a(v.class);
                                    Je.a n23 = R4.b.n2(H.O(a5), C.f37623a.b(v.class), a5);
                                    Yc.f fVar2 = lVar.f17014a;
                                    fVar2.getClass();
                                    obj7 = W.S(fVar2, n23, gVar2, this);
                                    enumC5000a = enumC5000a2;
                                    if (obj7 == enumC5000a) {
                                    }
                                    xVar3 = (x) obj7;
                                    z11 = xVar3 instanceof Vc.w;
                                    if (z11) {
                                    }
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                autoCloseable = "_display_name";
                                if (autoCloseable != null) {
                                    try {
                                        autoCloseable.close();
                                    } catch (RuntimeException e16) {
                                        throw e16;
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th2;
                            }
                        } catch (Exception e17) {
                            e11 = e17;
                            cursor = null;
                        } catch (Throwable th6) {
                            th2 = th6;
                            autoCloseable = null;
                            if (autoCloseable != null) {
                            }
                            throw th2;
                        }
                    } catch (Exception unused2) {
                    }
                    if (cursor.moveToFirst() && !cursor.isNull(0)) {
                        str2 = cursor.getString(0);
                        try {
                            cursor.close();
                        } catch (RuntimeException e18) {
                            throw e18;
                        } catch (Exception unused3) {
                        }
                        if (str2 == null) {
                        }
                        AbstractC3557B.Z(str2);
                        int length2 = bVar2.f8538a.length;
                        this.f16456k0 = abstractC1207j2;
                        this.f16451Y = bVar2;
                        this.f16452Z = str2;
                        this.f16455j0 = 3;
                        Ta.l lVar2 = (Ta.l) fVar.f16464Z;
                        lVar2.getClass();
                        Ta.g gVar22 = new Ta.g(str2, length2, e12, null);
                        w a52 = C.a(v.class);
                        Je.a n232 = R4.b.n2(H.O(a52), C.f37623a.b(v.class), a52);
                        Yc.f fVar22 = lVar2.f17014a;
                        fVar22.getClass();
                        obj7 = W.S(fVar22, n232, gVar22, this);
                        enumC5000a = enumC5000a2;
                        if (obj7 == enumC5000a) {
                        }
                        xVar3 = (x) obj7;
                        z11 = xVar3 instanceof Vc.w;
                        if (z11) {
                        }
                    } else {
                        try {
                            cursor.close();
                            str2 = null;
                            if (str2 == null) {
                                List<String> pathSegments = uri.getPathSegments();
                                AbstractC3557B.b0("getPathSegments(...)", pathSegments);
                                str2 = (String) t.o2(pathSegments);
                            }
                            AbstractC3557B.Z(str2);
                            int length22 = bVar2.f8538a.length;
                            this.f16456k0 = abstractC1207j2;
                            this.f16451Y = bVar2;
                            this.f16452Z = str2;
                            this.f16455j0 = 3;
                            Ta.l lVar22 = (Ta.l) fVar.f16464Z;
                            lVar22.getClass();
                            Ta.g gVar222 = new Ta.g(str2, length22, e12, null);
                            w a522 = C.a(v.class);
                            Je.a n2322 = R4.b.n2(H.O(a522), C.f37623a.b(v.class), a522);
                            Yc.f fVar222 = lVar22.f17014a;
                            fVar222.getClass();
                            obj7 = W.S(fVar222, n2322, gVar222, this);
                            enumC5000a = enumC5000a2;
                            if (obj7 == enumC5000a) {
                                return enumC5000a;
                            }
                            xVar3 = (x) obj7;
                            z11 = xVar3 instanceof Vc.w;
                            if (z11) {
                                if (z11) {
                                    Vc.w wVar = (Vc.w) xVar3;
                                    v0Var4 = new u0(null);
                                } else if (xVar3 instanceof q) {
                                    v0Var4 = p0Var;
                                } else if (xVar3 instanceof r) {
                                    xVar3.getClass();
                                    v0Var4 = x.a((r) xVar3);
                                } else {
                                    throw new RuntimeException();
                                }
                                Ic.d dVar2 = new Ic.d(v0Var4);
                                this.f16456k0 = null;
                                this.f16451Y = null;
                                this.f16452Z = null;
                                this.f16455j0 = 4;
                                if (abstractC1207j2.c(dVar2, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                                return yVar;
                            }
                            ?? obj8 = new Object();
                            obj8.f37622Y = q.f18560a;
                            AbstractC0810d abstractC0810d = fVar.f16464Z;
                            String str3 = ((v) ((Vc.w) xVar3).f18565a).f9072b;
                            byte[] bArr = bVar2.f8538a;
                            Ta.l lVar3 = (Ta.l) abstractC0810d;
                            lVar3.getClass();
                            AbstractC3557B.c0("url", str3);
                            AbstractC3557B.c0("data", bArr);
                            C1198e c1198e = new C1198e(new k(lVar3, str3, bArr, null));
                            N.W w10 = new N.W(abstractC1207j2, 5, obj8);
                            this.f16456k0 = abstractC1207j2;
                            this.f16451Y = bVar2;
                            this.f16452Z = str2;
                            this.f16453h0 = xVar3;
                            this.f16454i0 = obj8;
                            this.f16455j0 = 5;
                            if (c1198e.b(w10, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            str = str2;
                            b10 = obj8;
                            obj6 = b10.f37622Y;
                            if (obj6 instanceof Vc.w) {
                                x xVar4 = (x) obj6;
                                if (xVar4 instanceof Vc.w) {
                                    Vc.w wVar2 = (Vc.w) xVar4;
                                    v0Var3 = new u0(null);
                                } else if (xVar4 instanceof q) {
                                    v0Var3 = p0Var;
                                } else if (xVar4 instanceof r) {
                                    xVar4.getClass();
                                    v0Var3 = x.a((r) xVar4);
                                } else {
                                    throw new RuntimeException();
                                }
                                Ic.d dVar3 = new Ic.d(v0Var3);
                                this.f16456k0 = null;
                                this.f16451Y = null;
                                this.f16452Z = null;
                                this.f16453h0 = null;
                                this.f16454i0 = null;
                                this.f16455j0 = 6;
                                if (abstractC1207j2.c(dVar3, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                                return yVar;
                            }
                            Ic.g gVar3 = Ic.g.f8542a;
                            this.f16456k0 = abstractC1207j2;
                            this.f16451Y = bVar2;
                            this.f16452Z = str;
                            this.f16453h0 = xVar3;
                            this.f16454i0 = null;
                            this.f16455j0 = 7;
                            if (abstractC1207j2.c(gVar3, this) == enumC5000a) {
                                return enumC5000a;
                            }
                            xVar2 = xVar3;
                            AbstractC0810d abstractC0810d2 = fVar.f16464Z;
                            String str4 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                            this.f16456k0 = abstractC1207j2;
                            this.f16451Y = bVar2;
                            this.f16452Z = str;
                            this.f16453h0 = xVar2;
                            this.f16455j0 = 8;
                            Ta.l lVar4 = (Ta.l) abstractC0810d2;
                            lVar4.getClass();
                            Ta.i iVar2 = new Ta.i(str4, null);
                            w a10 = C.a(y.class);
                            Je.a n24 = R4.b.n2(H.O(a10), C.f37623a.b(y.class), a10);
                            Yc.f fVar3 = lVar4.f17014a;
                            fVar3.getClass();
                            obj5 = W.S(fVar3, n24, iVar2, this);
                            if (obj5 != enumC5000a) {
                                return enumC5000a;
                            }
                            bVar = bVar2;
                            abstractC1207j = abstractC1207j2;
                            x xVar5 = (x) obj5;
                            z10 = xVar5 instanceof Vc.w;
                            if (z10) {
                                if (z10) {
                                    Vc.w wVar3 = (Vc.w) xVar5;
                                    v0Var2 = new u0(null);
                                } else if (xVar5 instanceof q) {
                                    v0Var2 = p0Var;
                                } else if (xVar5 instanceof r) {
                                    xVar5.getClass();
                                    v0Var2 = x.a((r) xVar5);
                                } else {
                                    throw new RuntimeException();
                                }
                                Ic.d dVar4 = new Ic.d(v0Var2);
                                this.f16456k0 = null;
                                this.f16451Y = null;
                                this.f16452Z = null;
                                this.f16453h0 = null;
                                this.f16455j0 = 9;
                                if (abstractC1207j.c(dVar4, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                                return yVar;
                            } else if (d.f16450a[e12.ordinal()] == 1) {
                                String str5 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                                this.f16456k0 = abstractC1207j;
                                this.f16451Y = bVar;
                                this.f16452Z = str;
                                this.f16453h0 = xVar2;
                                this.f16455j0 = 10;
                                obj4 = f.h(fVar, str5, this);
                                if (obj4 == enumC5000a) {
                                    return enumC5000a;
                                }
                                xVar = (x) obj4;
                                if (!(xVar instanceof Vc.w)) {
                                    Vc.w wVar4 = (Vc.w) xVar;
                                    if (bVar instanceof h) {
                                        C6208v c6208v = C6209w.Companion;
                                        String str6 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                                        c6208v.getClass();
                                        h hVar = (h) bVar;
                                        obj2 = new Y(C6208v.a(str6), bVar.f8538a.length, hVar.f16476b, hVar.f16477c);
                                    } else if (e12 == E.f9043j0) {
                                        Z z14 = Z.f48377Y;
                                        C6208v c6208v2 = C6209w.Companion;
                                        String str7 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                                        c6208v2.getClass();
                                        obj2 = new C6174I(z14, this.f16461p0, C6208v.a(str7), this.f16462q0, String.valueOf(this.f16460o0));
                                    } else {
                                        C6208v c6208v3 = C6209w.Companion;
                                        String str8 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                                        c6208v3.getClass();
                                        String a11 = C6208v.a(str8);
                                        AbstractC3557B.Z(str);
                                        obj2 = new L(a11, str, new Integer(bVar.f8538a.length));
                                    }
                                    v0Var = new u0(obj2);
                                } else if (xVar instanceof q) {
                                    v0Var = p0Var;
                                } else if (xVar instanceof r) {
                                    xVar.getClass();
                                    v0Var = x.a((r) xVar);
                                } else {
                                    throw new RuntimeException();
                                }
                                dVar = new Ic.d(v0Var);
                                this.f16456k0 = null;
                                this.f16451Y = null;
                                this.f16452Z = null;
                                this.f16453h0 = null;
                                this.f16455j0 = 12;
                                if (abstractC1207j.c(dVar, this) != enumC5000a) {
                                    return enumC5000a;
                                }
                                return yVar;
                            } else {
                                String str9 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                                this.f16456k0 = abstractC1207j;
                                this.f16451Y = bVar;
                                this.f16452Z = str;
                                this.f16453h0 = xVar2;
                                this.f16455j0 = 11;
                                obj3 = f.a(fVar, str9, this);
                                if (obj3 == enumC5000a) {
                                    return enumC5000a;
                                }
                                xVar = (x) obj3;
                                if (!(xVar instanceof Vc.w)) {
                                }
                                dVar = new Ic.d(v0Var);
                                this.f16456k0 = null;
                                this.f16451Y = null;
                                this.f16452Z = null;
                                this.f16453h0 = null;
                                this.f16455j0 = 12;
                                if (abstractC1207j.c(dVar, this) != enumC5000a) {
                                }
                            }
                        } catch (RuntimeException e19) {
                            throw e19;
                        }
                    }
                } else {
                    EnumC5000a enumC5000a4 = enumC5000a2;
                    W.W(fVar.f16467j0, "Unable to process file: " + uri, null, null, 6);
                    if (z12) {
                        Ic.b bVar3 = (Ic.b) ((u0) v0Var5).f48468a;
                        v0Var5 = new u0(null);
                    } else if (!(v0Var5 instanceof p0) && !(v0Var5 instanceof q0)) {
                        throw new RuntimeException();
                    }
                    Ic.d dVar5 = new Ic.d(v0Var5);
                    this.f16456k0 = null;
                    this.f16455j0 = 2;
                    if (abstractC1207j2.c(dVar5, this) == enumC5000a4) {
                        return enumC5000a4;
                    }
                    return yVar;
                }
                break;
            case 1:
                abstractC1207j3 = (AbstractC1207j) this.f16456k0;
                N.B0(obj);
                abstractC1207j2 = abstractC1207j3;
                e10 = E.f9042i0;
                Uri uri2 = this.f16459n0;
                if (e12 != e10) {
                }
                z12 = v0Var5 instanceof u0;
                if (!z12) {
                }
                break;
            case 2:
                N.B0(obj);
                return yVar2;
            case 3:
                str2 = this.f16452Z;
                bVar2 = this.f16451Y;
                abstractC1207j2 = (AbstractC1207j) this.f16456k0;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                enumC5000a = enumC5000a3;
                obj7 = obj;
                xVar3 = (x) obj7;
                z11 = xVar3 instanceof Vc.w;
                if (z11) {
                }
                break;
            case 4:
                N.B0(obj);
                return yVar2;
            case 5:
                b10 = this.f16454i0;
                x xVar6 = this.f16453h0;
                String str10 = this.f16452Z;
                Ic.b bVar4 = this.f16451Y;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                str = str10;
                abstractC1207j2 = (AbstractC1207j) this.f16456k0;
                enumC5000a = enumC5000a3;
                xVar3 = xVar6;
                bVar2 = bVar4;
                obj6 = b10.f37622Y;
                if (obj6 instanceof Vc.w) {
                }
                break;
            case 6:
                N.B0(obj);
                return yVar2;
            case 7:
                xVar2 = this.f16453h0;
                str = this.f16452Z;
                bVar2 = this.f16451Y;
                abstractC1207j2 = (AbstractC1207j) this.f16456k0;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                enumC5000a = enumC5000a3;
                AbstractC0810d abstractC0810d22 = fVar.f16464Z;
                String str42 = ((v) ((Vc.w) xVar2).f18565a).f9073c;
                this.f16456k0 = abstractC1207j2;
                this.f16451Y = bVar2;
                this.f16452Z = str;
                this.f16453h0 = xVar2;
                this.f16455j0 = 8;
                Ta.l lVar42 = (Ta.l) abstractC0810d22;
                lVar42.getClass();
                Ta.i iVar22 = new Ta.i(str42, null);
                w a102 = C.a(y.class);
                Je.a n242 = R4.b.n2(H.O(a102), C.f37623a.b(y.class), a102);
                Yc.f fVar32 = lVar42.f17014a;
                fVar32.getClass();
                obj5 = W.S(fVar32, n242, iVar22, this);
                if (obj5 != enumC5000a) {
                }
                break;
            case 8:
                xVar2 = this.f16453h0;
                str = this.f16452Z;
                bVar = this.f16451Y;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                abstractC1207j = (AbstractC1207j) this.f16456k0;
                enumC5000a = enumC5000a3;
                obj5 = obj;
                x xVar52 = (x) obj5;
                z10 = xVar52 instanceof Vc.w;
                if (z10) {
                }
                break;
            case 9:
                N.B0(obj);
                return yVar2;
            case 10:
                xVar2 = this.f16453h0;
                str = this.f16452Z;
                bVar = this.f16451Y;
                abstractC1207j = (AbstractC1207j) this.f16456k0;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                enumC5000a = enumC5000a3;
                obj4 = obj;
                xVar = (x) obj4;
                if (!(xVar instanceof Vc.w)) {
                }
                dVar = new Ic.d(v0Var);
                this.f16456k0 = null;
                this.f16451Y = null;
                this.f16452Z = null;
                this.f16453h0 = null;
                this.f16455j0 = 12;
                if (abstractC1207j.c(dVar, this) != enumC5000a) {
                }
                break;
            case 11:
                xVar2 = this.f16453h0;
                str = this.f16452Z;
                bVar = this.f16451Y;
                abstractC1207j = (AbstractC1207j) this.f16456k0;
                N.B0(obj);
                p0Var = p0Var2;
                yVar = yVar2;
                enumC5000a = enumC5000a3;
                obj3 = obj;
                xVar = (x) obj3;
                if (!(xVar instanceof Vc.w)) {
                }
                dVar = new Ic.d(v0Var);
                this.f16456k0 = null;
                this.f16451Y = null;
                this.f16452Z = null;
                this.f16453h0 = null;
                this.f16455j0 = 12;
                if (abstractC1207j.c(dVar, this) != enumC5000a) {
                }
                break;
            case 12:
                N.B0(obj);
                return yVar2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
