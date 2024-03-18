package u7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
public final class o extends BasePendingResult {

    /* renamed from: p  reason: collision with root package name */
    public final m f46469p;

    public o(Status status) {
        super(null);
        this.f46469p = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final m G0(Status status) {
        return this.f46469p;
    }
}
