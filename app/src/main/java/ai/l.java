package ai;

import java.io.Closeable;
import ji.AbstractC4136k;
import ji.AbstractC4137l;

/* loaded from: classes.dex */
public final class l implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f24274Y = true;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4137l f24275Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC4136k f24276h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ e f24277i0;

    public l(AbstractC4137l abstractC4137l, AbstractC4136k abstractC4136k, e eVar) {
        this.f24277i0 = eVar;
        this.f24275Z = abstractC4137l;
        this.f24276h0 = abstractC4136k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24277i0.a(true, true, null);
    }
}
