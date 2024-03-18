package i4;

import java.io.Closeable;

/* renamed from: i4.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3473f implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final C3472e f32676Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f32677Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f32678h0;

    public C3473f(i iVar, C3472e c3472e) {
        this.f32678h0 = iVar;
        this.f32676Y = c3472e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f32677Z) {
            this.f32677Z = true;
            i iVar = this.f32678h0;
            synchronized (iVar) {
                C3472e c3472e = this.f32676Y;
                int i10 = c3472e.f32674h - 1;
                c3472e.f32674h = i10;
                if (i10 == 0 && c3472e.f32672f) {
                    Lg.i iVar2 = i.f32681v0;
                    iVar.P(c3472e);
                }
            }
        }
    }
}
