package j;

import L2.AbstractC0888i;
import L2.C0887h;
import L2.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import e3.q;
import java.util.ArrayList;
import java.util.Arrays;
import k1.n;
import p2.C5065s;
import r9.y;
import s2.AbstractC5530A;
import s2.u;
import s2.z;

/* loaded from: classes2.dex */
public final class j implements AbstractC0888i {

    /* renamed from: Y  reason: collision with root package name */
    public int f35817Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f35818Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f35819h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f35820i0;

    public j() {
        this(10, 3);
    }

    public final synchronized void a(long j6, C5065s c5065s) {
        int i10 = this.f35818Z;
        if (i10 > 0) {
            if (j6 <= ((long[]) this.f35819h0)[((this.f35817Y + i10) - 1) % ((Object[]) this.f35820i0).length]) {
                b();
            }
        }
        d();
        int i11 = this.f35817Y;
        int i12 = this.f35818Z;
        Object obj = this.f35820i0;
        int length = (i11 + i12) % ((Object[]) obj).length;
        ((long[]) this.f35819h0)[length] = j6;
        ((Object[]) obj)[length] = c5065s;
        this.f35818Z = i12 + 1;
    }

    public final synchronized void b() {
        this.f35817Y = 0;
        this.f35818Z = 0;
        Arrays.fill((Object[]) this.f35820i0, (Object) null);
    }

    @Override // L2.AbstractC0888i
    public final C0887h c(r rVar, long j6) {
        long o10 = rVar.o();
        int min = (int) Math.min(this.f35818Z, rVar.h() - o10);
        ((u) this.f35820i0).C(min);
        rVar.n(((u) this.f35820i0).f45193a, 0, min);
        u uVar = (u) this.f35820i0;
        int i10 = uVar.f45195c;
        long j10 = -1;
        long j11 = -1;
        long j12 = -9223372036854775807L;
        while (uVar.a() >= 188) {
            byte[] bArr = uVar.f45193a;
            int i11 = uVar.f45194b;
            while (i11 < i10 && bArr[i11] != 71) {
                i11++;
            }
            int i12 = i11 + 188;
            if (i12 > i10) {
                break;
            }
            long U02 = y.U0(i11, this.f35817Y, uVar);
            if (U02 != -9223372036854775807L) {
                long b10 = ((z) this.f35819h0).b(U02);
                if (b10 > j6) {
                    if (j12 == -9223372036854775807L) {
                        return new C0887h(b10, -1, o10);
                    }
                    return new C0887h(-9223372036854775807L, 0, o10 + j11);
                } else if (100000 + b10 > j6) {
                    return new C0887h(-9223372036854775807L, 0, o10 + i11);
                } else {
                    j12 = b10;
                    j11 = i11;
                }
            }
            uVar.F(i12);
            j10 = i12;
        }
        if (j12 != -9223372036854775807L) {
            return new C0887h(j12, -2, o10 + j10);
        }
        return C0887h.f10602d;
    }

    public final void d() {
        int length = ((Object[]) this.f35820i0).length;
        if (this.f35818Z < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f35817Y;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f35819h0, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f35820i0, this.f35817Y, objArr, 0, i12);
        int i13 = this.f35817Y;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f35819h0, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f35820i0, 0, objArr, i12, this.f35817Y);
        }
        this.f35819h0 = jArr;
        this.f35820i0 = objArr;
        this.f35817Y = 0;
    }

    public final synchronized Object e(long j6) {
        Object obj;
        obj = null;
        while (this.f35818Z > 0 && j6 - ((long[]) this.f35819h0)[this.f35817Y] >= 0) {
            obj = f();
        }
        return obj;
    }

    public final Object f() {
        boolean z10;
        if (this.f35818Z > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        Object obj = this.f35820i0;
        int i10 = this.f35817Y;
        Object obj2 = ((Object[]) obj)[i10];
        ((Object[]) obj)[i10] = null;
        this.f35817Y = (i10 + 1) % ((Object[]) obj).length;
        this.f35818Z--;
        return obj2;
    }

    @Override // L2.AbstractC0888i
    public final void h() {
        u uVar = (u) this.f35820i0;
        byte[] bArr = AbstractC5530A.f45136f;
        uVar.getClass();
        uVar.D(bArr.length, bArr);
    }

    public j(int i10, int i11) {
        if (i11 != 4) {
            this.f35819h0 = new long[i10];
            this.f35820i0 = new Object[i10];
            return;
        }
        this.f35819h0 = new q[i10];
        this.f35818Z = 0;
    }

    public j(Context context, XmlResourceParser xmlResourceParser) {
        this.f35819h0 = new ArrayList();
        this.f35818Z = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), k1.r.f36951g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f35817Y = obtainStyledAttributes.getResourceId(index, this.f35817Y);
            } else if (index == 1) {
                this.f35818Z = obtainStyledAttributes.getResourceId(index, this.f35818Z);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f35818Z);
                context.getResources().getResourceName(this.f35818Z);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f35820i0 = nVar;
                    nVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f35818Z, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
