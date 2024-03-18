package N;

import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import H0.Y0;
import L2.AbstractC0888i;
import L2.C0887h;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import bh.C2224n;
import fh.C3097x;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.xmlpull.v1.XmlPullParserException;
import r1.AbstractC5356c;
import s2.AbstractC5530A;
import s2.AbstractC5535e;

/* renamed from: N.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025i implements AbstractC0888i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12349Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f12350Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f12351h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f12352i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1025i(int i10) {
        this(new CopyOnWriteArrayList(), 0, (C0492y) null);
        this.f12349Y = i10;
        if (i10 == 8) {
            this.f12351h0 = new Object[8];
            this.f12350Z = 0;
        } else if (i10 != 9) {
        } else {
            this.f12351h0 = new Object[8];
            int[] iArr = new int[8];
            for (int i11 = 0; i11 < 8; i11++) {
                iArr[i11] = -1;
            }
            this.f12352i0 = iArr;
            this.f12350Z = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1025i b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        int i12;
        int i13;
        int i14;
        float f15;
        int i15;
        float f16;
        float f17;
        float f18;
        float f19;
        U3.c cVar;
        Object obj;
        int i16;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b10 = AbstractC5356c.b(resources, xml, asAttributeSet, theme);
                    return new C1025i((Object) null, b10, b10.getDefaultColor(), 1);
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray O02 = r9.y.O0(resources, theme, asAttributeSet, n1.a.f39592d);
                if (!r9.y.z0(xml, "startX")) {
                    f6 = 0.0f;
                } else {
                    f6 = O02.getFloat(8, 0.0f);
                }
                if (!r9.y.z0(xml, "startY")) {
                    f10 = 0.0f;
                } else {
                    f10 = O02.getFloat(9, 0.0f);
                }
                if (!r9.y.z0(xml, "endX")) {
                    f11 = 0.0f;
                } else {
                    f11 = O02.getFloat(10, 0.0f);
                }
                if (!r9.y.z0(xml, "endY")) {
                    f12 = 0.0f;
                } else {
                    f12 = O02.getFloat(11, 0.0f);
                }
                if (!r9.y.z0(xml, "centerX")) {
                    f13 = 0.0f;
                } else {
                    f13 = O02.getFloat(3, 0.0f);
                }
                if (!r9.y.z0(xml, "centerY")) {
                    f14 = 0.0f;
                } else {
                    f14 = O02.getFloat(4, 0.0f);
                }
                if (!r9.y.z0(xml, "type")) {
                    i11 = 0;
                } else {
                    i11 = O02.getInt(2, 0);
                }
                if (!r9.y.z0(xml, "startColor")) {
                    i12 = 0;
                } else {
                    i12 = O02.getColor(0, 0);
                }
                boolean z02 = r9.y.z0(xml, "centerColor");
                if (!r9.y.z0(xml, "centerColor")) {
                    i13 = 0;
                } else {
                    i13 = O02.getColor(7, 0);
                }
                if (!r9.y.z0(xml, "endColor")) {
                    i14 = 0;
                } else {
                    i14 = O02.getColor(1, 0);
                }
                if (!r9.y.z0(xml, "tileMode")) {
                    f15 = f13;
                    i15 = 0;
                } else {
                    f15 = f13;
                    i15 = O02.getInt(6, 0);
                }
                if (!r9.y.z0(xml, "gradientRadius")) {
                    f16 = f14;
                    f17 = 0.0f;
                } else {
                    f16 = f14;
                    f17 = O02.getFloat(5, 0.0f);
                }
                O02.recycle();
                int depth = xml.getDepth() + 1;
                float f20 = f17;
                ArrayList arrayList = new ArrayList(20);
                float f21 = f12;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    f18 = f11;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f19 = f10;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                            TypedArray O03 = r9.y.O0(resources, theme, asAttributeSet, n1.a.f39593e);
                            boolean hasValue = O03.hasValue(0);
                            boolean hasValue2 = O03.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color = O03.getColor(0, 0);
                            float f22 = O03.getFloat(1, 0.0f);
                            O03.recycle();
                            arrayList2.add(Integer.valueOf(color));
                            arrayList.add(Float.valueOf(f22));
                        }
                        f11 = f18;
                        f10 = f19;
                    } else {
                        f19 = f10;
                        break;
                    }
                }
                if (arrayList2.size() > 0) {
                    cVar = new U3.c(arrayList2, arrayList);
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    if (z02) {
                        cVar = new U3.c(i12, i13, i14);
                    } else {
                        cVar = new U3.c(i12, i14);
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        int[] iArr = (int[]) cVar.f17396Z;
                        float[] fArr = (float[]) cVar.f17397h0;
                        if (i15 != 1) {
                            if (i15 != 2) {
                                tileMode2 = Shader.TileMode.CLAMP;
                            } else {
                                tileMode2 = Shader.TileMode.MIRROR;
                            }
                        } else {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                        i16 = 0;
                        obj = new LinearGradient(f6, f19, f18, f21, iArr, fArr, tileMode2);
                    } else {
                        i16 = 0;
                        obj = new SweepGradient(f15, f16, (int[]) cVar.f17396Z, (float[]) cVar.f17397h0);
                    }
                } else {
                    float f23 = f15;
                    float f24 = f16;
                    i16 = 0;
                    if (f20 > 0.0f) {
                        int[] iArr2 = (int[]) cVar.f17396Z;
                        float[] fArr2 = (float[]) cVar.f17397h0;
                        if (i15 != 1) {
                            if (i15 != 2) {
                                tileMode = Shader.TileMode.CLAMP;
                            } else {
                                tileMode = Shader.TileMode.MIRROR;
                            }
                        } else {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                        obj = new RadialGradient(f23, f24, f20, iArr2, fArr2, tileMode);
                    } else {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                }
                return new C1025i(obj, (Object) null, i16, 1);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final void a(int i10, E2.V v10) {
        boolean z10;
        boolean z11 = false;
        if (this.f12350Z == -1) {
            if (((SparseArray) this.f12351h0).size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.n(z10);
            this.f12350Z = 0;
        }
        if (((SparseArray) this.f12351h0).size() > 0) {
            SparseArray sparseArray = (SparseArray) this.f12351h0;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z11 = true;
            }
            Gi.e.l(z11);
            if (keyAt == i10) {
                SparseArray sparseArray2 = (SparseArray) this.f12351h0;
                ((AbstractC5535e) this.f12352i0).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        ((SparseArray) this.f12351h0).append(i10, v10);
    }

    @Override // L2.AbstractC0888i
    public final C0887h c(L2.r rVar, long j6) {
        long o10 = rVar.o();
        long e10 = e(rVar);
        long d10 = rVar.d();
        rVar.e(Math.max(6, ((L2.v) this.f12351h0).f10644c));
        long e11 = e(rVar);
        long d11 = rVar.d();
        if (e10 <= j6 && e11 > j6) {
            return new C0887h(-9223372036854775807L, 0, d10);
        }
        if (e11 <= j6) {
            return new C0887h(e11, -2, d11);
        }
        return new C0887h(e10, -1, o10);
    }

    public final void d(C0488u c0488u) {
        Iterator it = ((CopyOnWriteArrayList) this.f12352i0).iterator();
        while (it.hasNext()) {
            E2.B b10 = (E2.B) it.next();
            AbstractC5530A.F(b10.f4126a, new Q1.n(this, b10.f4127b, c0488u, 9));
        }
    }

    public final long e(L2.r rVar) {
        int i10;
        while (rVar.d() < rVar.h() - 6) {
            L2.v vVar = (L2.v) this.f12351h0;
            int i11 = this.f12350Z;
            I2.i iVar = (I2.i) this.f12352i0;
            long d10 = rVar.d();
            byte[] bArr = new byte[2];
            int i12 = 0;
            rVar.n(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
                rVar.k();
                rVar.e((int) (d10 - rVar.o()));
            } else {
                s2.u uVar = new s2.u(16);
                System.arraycopy(bArr, 0, uVar.f45193a, 0, 2);
                byte[] bArr2 = uVar.f45193a;
                while (i12 < 14 && (i10 = rVar.i(bArr2, 2 + i12, 14 - i12)) != -1) {
                    i12 += i10;
                }
                uVar.E(i12);
                rVar.k();
                rVar.e((int) (d10 - rVar.o()));
                if (Gi.e.j(uVar, vVar, i11, iVar)) {
                    break;
                }
            }
            rVar.e(1);
        }
        if (rVar.d() >= rVar.h() - 6) {
            rVar.e((int) (rVar.h() - rVar.d()));
            return ((L2.v) this.f12351h0).f10651j;
        }
        return ((I2.i) this.f12352i0).f7995b;
    }

    public final Object f(int i10) {
        if (this.f12350Z == -1) {
            this.f12350Z = 0;
        }
        while (true) {
            int i11 = this.f12350Z;
            if (i11 <= 0 || i10 >= ((SparseArray) this.f12351h0).keyAt(i11)) {
                break;
            }
            this.f12350Z--;
        }
        while (this.f12350Z < ((SparseArray) this.f12351h0).size() - 1 && i10 >= ((SparseArray) this.f12351h0).keyAt(this.f12350Z + 1)) {
            this.f12350Z++;
        }
        return ((SparseArray) this.f12351h0).valueAt(this.f12350Z);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f12350Z + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f12351h0)[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (AbstractC3557B.K(serialDescriptor.e(), C2224n.f26016b)) {
                    if (((int[]) this.f12352i0)[i11] != -1) {
                        sb2.append("[");
                        sb2.append(((int[]) this.f12352i0)[i11]);
                        sb2.append("]");
                    }
                } else {
                    int i12 = ((int[]) this.f12352i0)[i11];
                    if (i12 >= 0) {
                        sb2.append(Separators.DOT);
                        sb2.append(serialDescriptor.g(i12));
                    }
                }
            } else if (obj != C3097x.f30901a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public final boolean i() {
        if (((Shader) this.f12351h0) == null) {
            Object obj = this.f12352i0;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final void j(C0484p c0484p, C0488u c0488u) {
        Iterator it = ((CopyOnWriteArrayList) this.f12352i0).iterator();
        while (it.hasNext()) {
            E2.B b10 = (E2.B) it.next();
            AbstractC5530A.F(b10.f4126a, new E2.A(this, b10.f4127b, c0484p, c0488u, 2));
        }
    }

    public final void k(C0484p c0484p, C0488u c0488u) {
        Iterator it = ((CopyOnWriteArrayList) this.f12352i0).iterator();
        while (it.hasNext()) {
            E2.B b10 = (E2.B) it.next();
            AbstractC5530A.F(b10.f4126a, new E2.A(this, b10.f4127b, c0484p, c0488u, 1));
        }
    }

    public final void l(C0484p c0484p, C0488u c0488u, IOException iOException, boolean z10) {
        Iterator it = ((CopyOnWriteArrayList) this.f12352i0).iterator();
        while (it.hasNext()) {
            E2.B b10 = (E2.B) it.next();
            AbstractC5530A.F(b10.f4126a, new y2.Y(this, b10.f4127b, c0484p, c0488u, iOException, z10, 1));
        }
    }

    public final void m(C0484p c0484p, C0488u c0488u) {
        Iterator it = ((CopyOnWriteArrayList) this.f12352i0).iterator();
        while (it.hasNext()) {
            E2.B b10 = (E2.B) it.next();
            AbstractC5530A.F(b10.f4126a, new E2.A(this, b10.f4127b, c0484p, c0488u, 0));
        }
    }

    public final boolean n(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = (ColorStateList) this.f12352i0;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f12350Z) {
                this.f12350Z = colorForState;
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i10 = this.f12350Z * 2;
        Object[] copyOf = Arrays.copyOf((Object[]) this.f12351h0, i10);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        this.f12351h0 = copyOf;
        int[] copyOf2 = Arrays.copyOf((int[]) this.f12352i0, i10);
        AbstractC3557B.b0("copyOf(...)", copyOf2);
        this.f12352i0 = copyOf2;
    }

    public final String toString() {
        switch (this.f12349Y) {
            case 9:
                return g();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1025i(int i10, int i11, Serializable serializable, Object obj) {
        this.f12349Y = i11;
        this.f12351h0 = obj;
        this.f12350Z = i10;
        this.f12352i0 = serializable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1025i(L2.v vVar, int i10) {
        this(i10, vVar);
        this.f12349Y = 6;
    }

    public /* synthetic */ C1025i(Object obj, Object obj2, int i10, int i11) {
        this.f12349Y = i11;
        this.f12351h0 = obj;
        this.f12352i0 = obj2;
        this.f12350Z = i10;
    }

    public C1025i(p2.Y y10) {
        this.f12349Y = 4;
        this.f12351h0 = new SparseArray();
        this.f12352i0 = y10;
        this.f12350Z = -1;
    }

    public C1025i(int i10, L2.v vVar) {
        this.f12349Y = 6;
        this.f12351h0 = vVar;
        this.f12350Z = i10;
        this.f12352i0 = new I2.i(0);
    }

    public C1025i(int i10, Nh.k kVar, C1025i c1025i) {
        this.f12349Y = 10;
        this.f12350Z = i10;
        this.f12351h0 = kVar;
        this.f12352i0 = c1025i;
    }

    @Override // L2.AbstractC0888i
    public final /* synthetic */ void h() {
    }

    public C1025i(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C0492y c0492y) {
        this.f12349Y = 3;
        this.f12352i0 = copyOnWriteArrayList;
        this.f12350Z = i10;
        this.f12351h0 = c0492y;
    }

    public C1025i(Y0 y02) {
        this.f12349Y = 0;
        this.f12351h0 = y02;
    }

    public C1025i(int i10, Nh.k kVar) {
        this.f12349Y = 11;
        this.f12350Z = i10;
        this.f12351h0 = kVar;
    }
}
