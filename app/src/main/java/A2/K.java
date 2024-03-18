package A2;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import q2.AbstractC5264d;
import q2.C5262b;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class K implements q2.e {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5264d[] f416a;

    /* renamed from: b  reason: collision with root package name */
    public final X f417b;

    /* renamed from: c  reason: collision with root package name */
    public final q2.h f418c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q2.h] */
    public K(AbstractC5264d... abstractC5264dArr) {
        X x10 = new X();
        ?? obj = new Object();
        obj.f43697c = 1.0f;
        obj.f43698d = 1.0f;
        C5262b c5262b = C5262b.f43661e;
        obj.f43699e = c5262b;
        obj.f43700f = c5262b;
        obj.f43701g = c5262b;
        obj.f43702h = c5262b;
        ByteBuffer byteBuffer = AbstractC5264d.f43666a;
        obj.f43705k = byteBuffer;
        obj.f43706l = byteBuffer.asShortBuffer();
        obj.f43707m = byteBuffer;
        obj.f43696b = -1;
        AbstractC5264d[] abstractC5264dArr2 = new AbstractC5264d[abstractC5264dArr.length + 2];
        this.f416a = abstractC5264dArr2;
        System.arraycopy(abstractC5264dArr, 0, abstractC5264dArr2, 0, abstractC5264dArr.length);
        this.f417b = x10;
        this.f418c = obj;
        abstractC5264dArr2[abstractC5264dArr.length] = x10;
        abstractC5264dArr2[abstractC5264dArr.length + 1] = obj;
    }

    @Override // q2.e
    public final long a(long j6) {
        q2.h hVar = this.f418c;
        if (hVar.f43709o >= 1024) {
            long j10 = hVar.f43708n;
            q2.g gVar = hVar.f43704j;
            gVar.getClass();
            long j11 = j10 - ((gVar.f43684k * gVar.f43675b) * 2);
            int i10 = hVar.f43702h.f43662a;
            int i11 = hVar.f43701g.f43662a;
            if (i10 == i11) {
                return AbstractC5530A.I(j6, j11, hVar.f43709o, RoundingMode.FLOOR);
            }
            return AbstractC5530A.I(j6, j11 * i10, hVar.f43709o * i11, RoundingMode.FLOOR);
        }
        return (long) (hVar.f43697c * j6);
    }

    @Override // q2.e
    public final p2.S b(p2.S s10) {
        float f6 = s10.f41934Y;
        q2.h hVar = this.f418c;
        if (hVar.f43697c != f6) {
            hVar.f43697c = f6;
            hVar.f43703i = true;
        }
        float f10 = hVar.f43698d;
        float f11 = s10.f41935Z;
        if (f10 != f11) {
            hVar.f43698d = f11;
            hVar.f43703i = true;
        }
        return s10;
    }

    @Override // q2.e
    public final long d() {
        return this.f417b.f524t;
    }

    @Override // q2.e
    public final boolean e(boolean z10) {
        this.f417b.f517m = z10;
        return z10;
    }

    @Override // q2.e
    public final AbstractC5264d[] f() {
        return this.f416a;
    }
}
