package I5;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f8062Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f8063Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f8064h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j6, long j10, long j11) {
        super(0);
        this.f8062Y = j6;
        this.f8063Z = j10;
        this.f8064h0 = j11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes\u2026", Arrays.copyOf(new Object[]{Long.valueOf(this.f8062Y), Long.valueOf(this.f8063Z), Long.valueOf(this.f8064h0)}, 3));
    }
}
