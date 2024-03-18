package kotlinx.serialization.internal;

import R4.b;
import Xf.f;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import bh.AbstractC2223m;
import bh.C2224n;
import com.google.android.gms.internal.play_billing.N;
import dh.AbstractC2680F;
import dh.AbstractC2710l;
import dh.C2706i0;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kf.t;
import kf.v;
import kf.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, AbstractC2710l {

    /* renamed from: a  reason: collision with root package name */
    public final String f37649a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2680F f37650b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37651c;

    /* renamed from: d  reason: collision with root package name */
    public int f37652d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f37653e;

    /* renamed from: f  reason: collision with root package name */
    public final List[] f37654f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f37655g;

    /* renamed from: h  reason: collision with root package name */
    public Map f37656h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC3957g f37657i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC3957g f37658j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC3957g f37659k;

    public PluginGeneratedSerialDescriptor(String str, AbstractC2680F abstractC2680F, int i10) {
        AbstractC3557B.c0("serialName", str);
        this.f37649a = str;
        this.f37650b = abstractC2680F;
        this.f37651c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f37653e = strArr;
        int i12 = this.f37651c;
        this.f37654f = new List[i12];
        this.f37655g = new boolean[i12];
        this.f37656h = w.f37484Y;
        EnumC3958h enumC3958h = EnumC3958h.f36152Y;
        this.f37657i = b.C1(enumC3958h, new C2706i0(this, 1));
        this.f37658j = b.C1(enumC3958h, new C2706i0(this, 2));
        this.f37659k = b.C1(enumC3958h, new C2706i0(this, 0));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f37649a;
    }

    @Override // dh.AbstractC2710l
    public final Set b() {
        return this.f37656h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        AbstractC3557B.c0("name", str);
        Integer num = (Integer) this.f37656h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC2223m e() {
        return C2224n.f26015a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC3557B.K(this.f37649a, serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.f37658j.getValue(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).f37658j.getValue())) {
                int f6 = serialDescriptor.f();
                int i10 = this.f37651c;
                if (i10 == f6) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (AbstractC3557B.K(i(i11).a(), serialDescriptor.i(i11).a()) && AbstractC3557B.K(i(i11).e(), serialDescriptor.i(i11).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f37651c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i10) {
        return this.f37653e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return v.f37483Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i10) {
        List list = this.f37654f[i10];
        if (list == null) {
            return v.f37483Y;
        }
        return list;
    }

    public int hashCode() {
        return ((Number) this.f37659k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor i(int i10) {
        return ((KSerializer[]) this.f37657i.getValue())[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i10) {
        return this.f37655g[i10];
    }

    public final void k(String str, boolean z10) {
        AbstractC3557B.c0("name", str);
        int i10 = this.f37652d + 1;
        this.f37652d = i10;
        String[] strArr = this.f37653e;
        strArr[i10] = str;
        this.f37655g[i10] = z10;
        this.f37654f[i10] = null;
        if (i10 == this.f37651c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                hashMap.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f37656h = hashMap;
        }
    }

    public String toString() {
        return t.m2(N.D0(0, this.f37651c), ", ", a.n(new StringBuilder(), this.f37649a, '('), Separators.RPAREN, new f(24, this), 24);
    }
}
