package v7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.C3636c1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements u7.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f47320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3636c1 f47321b;

    public m(C3636c1 c3636c1, s7.h hVar) {
        this.f47321b = c3636c1;
        this.f47320a = hVar;
    }

    @Override // u7.k
    public final void a(Status status) {
        ((Map) this.f47321b.f34285Z).remove(this.f47320a);
    }
}
