package r3;

import id.AbstractC3557B;
import java.util.ArrayList;

/* renamed from: r3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5363f extends C5362e {

    /* renamed from: e  reason: collision with root package name */
    public long f44398e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5363f(ArrayList arrayList) {
        super(arrayList);
        AbstractC3557B.c0("states", arrayList);
    }

    @Override // r3.C5362e
    public boolean equals(Object obj) {
        if ((obj instanceof C5363f) && super.equals(obj) && this.f44398e == ((C5363f) obj).f44398e) {
            return true;
        }
        return false;
    }

    @Override // r3.C5362e
    public int hashCode() {
        long j6 = this.f44398e;
        return (super.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    @Override // r3.C5362e
    public String toString() {
        return "FrameData(frameStartNanos=" + this.f44395b + ", frameDurationUiNanos=" + this.f44396c + ", frameDurationCpuNanos=" + this.f44398e + ", isJank=" + this.f44397d + ", states=" + this.f44394a + ')';
    }
}
