package r3;

/* loaded from: classes.dex */
public final class g extends C5363f {

    /* renamed from: f  reason: collision with root package name */
    public long f44399f;

    /* renamed from: g  reason: collision with root package name */
    public long f44400g;

    @Override // r3.C5363f, r3.C5362e
    public final boolean equals(Object obj) {
        if ((obj instanceof g) && super.equals(obj)) {
            g gVar = (g) obj;
            if (this.f44399f == gVar.f44399f && this.f44400g == gVar.f44400g) {
                return true;
            }
        }
        return false;
    }

    @Override // r3.C5363f, r3.C5362e
    public final int hashCode() {
        long j6 = this.f44399f;
        int i10 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        long j10 = this.f44400g;
        return i10 + (super.hashCode() * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    @Override // r3.C5363f, r3.C5362e
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.f44395b + ", frameDurationUiNanos=" + this.f44396c + ", frameDurationCpuNanos=" + this.f44398e + ", frameDurationTotalNanos=" + this.f44399f + ", frameOverrunNanos=" + this.f44400g + ", isJank=" + this.f44397d + ", states=" + this.f44394a + ')';
    }
}
