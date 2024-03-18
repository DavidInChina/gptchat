package o8;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.n1;
import u8.C5852b;
import u8.C5865o;

/* renamed from: o8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4950c extends n1 {

    /* renamed from: b  reason: collision with root package name */
    public final C5865o f40934b = new C5865o("RequestDialogCallbackImpl");

    /* renamed from: c  reason: collision with root package name */
    public final String f40935c;

    /* renamed from: d  reason: collision with root package name */
    public final v f40936d;

    /* renamed from: e  reason: collision with root package name */
    public final N7.f f40937e;

    /* renamed from: f  reason: collision with root package name */
    public final Activity f40938f;

    /* renamed from: g  reason: collision with root package name */
    public final C5852b f40939g;

    public BinderC4950c(Context context, v vVar, Activity activity, N7.f fVar, C5852b c5852b) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback", 5);
        this.f40935c = context.getPackageName();
        this.f40936d = vVar;
        this.f40937e = fVar;
        this.f40938f = activity;
        this.f40939g = c5852b;
    }
}
