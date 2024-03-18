package Q1;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f14304d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f14305a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.n f14306b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f14307c = 0;

    public D(U3.n nVar, int i10) {
        this.f14306b = nVar;
        this.f14305a = i10;
    }

    public final int a(int i10) {
        R1.a c10 = c();
        int a5 = c10.a(16);
        if (a5 != 0) {
            Object obj = c10.f15023d;
            int i11 = a5 + c10.f15020a;
            return ((ByteBuffer) obj).getInt((i10 * 4) + ((ByteBuffer) obj).getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public final int b() {
        R1.a c10 = c();
        int a5 = c10.a(16);
        if (a5 != 0) {
            int i10 = a5 + c10.f15020a;
            return ((ByteBuffer) c10.f15023d).getInt(((ByteBuffer) c10.f15023d).getInt(i10) + i10);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [R1.c, java.lang.Object] */
    public final R1.a c() {
        ThreadLocal threadLocal = f14304d;
        R1.a aVar = (R1.a) threadLocal.get();
        R1.a aVar2 = aVar;
        if (aVar == null) {
            ?? cVar = new R1.c();
            threadLocal.set(cVar);
            aVar2 = cVar;
        }
        R1.b bVar = (R1.b) this.f14306b.f17426Y;
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i10 = a5 + bVar.f15020a;
            int i11 = (this.f14305a * 4) + ((ByteBuffer) bVar.f15023d).getInt(i10) + i10 + 4;
            aVar2.b(((ByteBuffer) bVar.f15023d).getInt(i11) + i11, (ByteBuffer) bVar.f15023d);
        }
        return aVar2;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        R1.a c10 = c();
        int a5 = c10.a(4);
        if (a5 != 0) {
            i10 = ((ByteBuffer) c10.f15023d).getInt(a5 + c10.f15020a);
        } else {
            i10 = 0;
        }
        sb2.append(Integer.toHexString(i10));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(Separators.SP);
        }
        return sb2.toString();
    }
}
