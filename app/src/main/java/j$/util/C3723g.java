package j$.util;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.g  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3723g implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    private double f35363a;

    /* renamed from: b  reason: collision with root package name */
    private double f35364b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void c(double d10) {
        double d11 = d10 - this.f35363a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f35363a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final void a(C3723g c3723g) {
        this.count += c3723g.count;
        this.f35364b += c3723g.f35364b;
        c(c3723g.sum);
        c(c3723g.f35363a);
        this.min = Math.min(this.min, c3723g.min);
        this.max = Math.max(this.max, c3723g.max);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.count++;
        this.f35364b += d10;
        c(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    public final String toString() {
        double d10;
        Object[] objArr = new Object[6];
        objArr[0] = C3723g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        double d11 = this.sum + this.f35363a;
        if (Double.isNaN(d11) && Double.isInfinite(this.f35364b)) {
            d11 = this.f35364b;
        }
        objArr[2] = Double.valueOf(d11);
        objArr[3] = Double.valueOf(this.min);
        if (this.count > 0) {
            double d12 = this.sum + this.f35363a;
            if (Double.isNaN(d12) && Double.isInfinite(this.f35364b)) {
                d12 = this.f35364b;
            }
            d10 = d12 / this.count;
        } else {
            d10 = 0.0d;
        }
        objArr[4] = Double.valueOf(d10);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
