package H0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: H0.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0682h0 implements W0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6960a;

    public C0682h0(Context context) {
        this.f6960a = context;
    }

    @Override // H0.W0
    public final void a(String str) {
        this.f6960a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
