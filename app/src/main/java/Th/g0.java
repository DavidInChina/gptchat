package th;

import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* JADX WARN: Init of enum i0 can be incorrect */
/* loaded from: classes.dex */
public enum g0 {
    JAVA_19_CAPABLE_VM('[', ']', true),
    JAVA_19_CAPABLE_VM('{', '}', true),
    JAVA_19_CAPABLE_VM('{', '}', true),
    JAVA_19_CAPABLE_VM('{', '}', false),
    JAVA_19_CAPABLE_VM('{', '}', r5.e(r7));
    

    /* renamed from: Y  reason: collision with root package name */
    public final char f46221Y;

    /* renamed from: Z  reason: collision with root package name */
    public final char f46222Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f46223h0;

    static {
        ph.f fVar = ph.f.f43189k0;
        ph.f.i(fVar);
        ph.f fVar2 = ph.f.f43201w0;
        ph.f i10 = ph.f.i(fVar);
        if (i10.d(ph.f.f43203y0)) {
        } else if (i10.d(fVar2)) {
        } else if (i10.d(ph.f.f43198t0)) {
        } else if (i10.d(ph.f.f43193o0)) {
        }
    }

    g0(char c10, char c11, boolean z10) {
        this.f46221Y = c10;
        this.f46222Z = c11;
        this.f46223h0 = z10;
    }

    public final String a(int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder("Array with component tag: ");
        if (!this.f46223h0 && i10 != 14) {
            str = Character.toString((char) AbstractC4194d.q(i10));
        } else {
            str = Integer.toString(AbstractC4194d.q(i10));
        }
        sb2.append(str);
        return sb2.toString();
    }

    public String b(byte b10) {
        return Byte.toString(b10);
    }

    public abstract String c(char c10);

    public abstract String d(double d10);

    public abstract String e(float f6);

    public abstract String f(long j6);

    public abstract String g(String str);

    public final String h(List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46221Y);
        boolean z10 = true;
        for (Object obj : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(obj);
        }
        sb2.append(this.f46222Z);
        return sb2.toString();
    }

    public abstract String i(l1 l1Var);

    public String j(Class cls) {
        return cls.toString();
    }
}
