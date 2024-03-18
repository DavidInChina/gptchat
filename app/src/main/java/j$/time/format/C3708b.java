package j$.time.format;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3708b extends C {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ B f35007e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3708b(B b10) {
        this.f35007e = b10;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.k kVar, j$.time.temporal.r rVar, long j6, H h10, Locale locale) {
        return this.f35007e.a(j6, h10);
    }

    @Override // j$.time.format.C
    public final String f(j$.time.temporal.r rVar, long j6, H h10, Locale locale) {
        return this.f35007e.a(j6, h10);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.k kVar, j$.time.temporal.r rVar, H h10, Locale locale) {
        return this.f35007e.b(h10);
    }

    @Override // j$.time.format.C
    public final Iterator h(j$.time.temporal.r rVar, H h10, Locale locale) {
        return this.f35007e.b(h10);
    }
}
