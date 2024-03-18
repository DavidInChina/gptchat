package i4;

import G0.C0571a;
import java.io.IOException;
import ji.AbstractC4120I;
import ji.AbstractC4142q;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class j extends AbstractC4142q {

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f32698Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f32699h0;

    public j(AbstractC4120I abstractC4120I, C0571a c0571a) {
        super(abstractC4120I);
        this.f32698Z = c0571a;
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f32699h0 = true;
            this.f32698Z.invoke(e10);
        }
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f32699h0 = true;
            this.f32698Z.invoke(e10);
        }
    }

    @Override // ji.AbstractC4142q, ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        if (this.f32699h0) {
            c4135j.skip(j6);
            return;
        }
        try {
            super.o(c4135j, j6);
        } catch (IOException e10) {
            this.f32699h0 = true;
            this.f32698Z.invoke(e10);
        }
    }
}
