package k5;

import android.content.Intent;
import android.net.Uri;

/* renamed from: k5.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4181g {

    /* renamed from: a  reason: collision with root package name */
    public final int f37063a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f37064b;

    public C4181g(Intent intent) {
        Uri uri;
        int i10;
        this.f37064b = intent;
        if (intent == null) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f37063a = i10;
    }

    public final boolean a() {
        Intent intent;
        Uri uri;
        if (this.f37063a == 0 && (intent = this.f37064b) != null) {
            if (intent == null) {
                uri = null;
            } else {
                uri = intent.getData();
            }
            if (uri == null) {
                return true;
            }
        }
        return false;
    }
}
