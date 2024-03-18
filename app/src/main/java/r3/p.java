package r3;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import id.AbstractC3557B;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: u  reason: collision with root package name */
    public final g f44423u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [r3.f, r3.g] */
    public p(i iVar, View view, Window window) {
        super(iVar, view, window);
        AbstractC3557B.c0("jankStats", iVar);
        ArrayList arrayList = this.f44410k;
        AbstractC3557B.c0("states", arrayList);
        ?? c5363f = new C5363f(arrayList);
        c5363f.f44399f = 0L;
        c5363f.f44400g = 0L;
        this.f44423u = c5363f;
    }

    @Override // r3.n
    public final long S2(FrameMetrics frameMetrics) {
        AbstractC3557B.c0("metrics", frameMetrics);
        return frameMetrics.getMetric(13);
    }

    @Override // r3.n
    public final C5363f T2(long j6, long j10, FrameMetrics frameMetrics) {
        AbstractC3557B.c0("frameMetrics", frameMetrics);
        boolean z10 = false;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j11 = j6 + metric;
        this.f44420q = j11;
        r rVar = this.f44409j.f44424a;
        if (rVar != null) {
            rVar.c(j6, j11, this.f44410k);
        }
        if (metric > j10) {
            z10 = true;
        }
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        g gVar = this.f44423u;
        gVar.f44395b = j6;
        gVar.f44396c = metric;
        gVar.f44397d = z10;
        gVar.f44398e = metric3;
        gVar.f44399f = metric2;
        gVar.f44400g = metric2 - frameMetrics.getMetric(13);
        return gVar;
    }
}
