package u7;

import com.google.android.gms.common.api.Status;

/* renamed from: u7.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5849e extends Exception {

    /* renamed from: Y  reason: collision with root package name */
    public final Status f46452Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5849e(Status status) {
        super(r0 + ": " + r1);
        int i10 = status.f26807Y;
        String str = status.f26808Z;
        str = str == null ? "" : str;
        this.f46452Y = status;
    }
}
