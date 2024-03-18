package R1;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f15020a;

    /* renamed from: b  reason: collision with root package name */
    public int f15021b;

    /* renamed from: c  reason: collision with root package name */
    public int f15022c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15023d;

    public c() {
        if (P5.c.f13819Y == null) {
            P5.c.f13819Y = new P5.c();
        }
    }

    public final int a(int i10) {
        if (i10 < this.f15022c) {
            return ((ByteBuffer) this.f15023d).getShort(this.f15021b + i10);
        }
        return 0;
    }

    public final void b(int i10, ByteBuffer byteBuffer) {
        this.f15023d = byteBuffer;
        if (byteBuffer != null) {
            this.f15020a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f15021b = i11;
            this.f15022c = ((ByteBuffer) this.f15023d).getShort(i11);
            return;
        }
        this.f15020a = 0;
        this.f15021b = 0;
        this.f15022c = 0;
    }
}
