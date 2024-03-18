package i4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.auth0.android.provider.AuthenticationActivity;
import id.AbstractC3557B;
import k5.C4186l;

/* renamed from: i4.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3471d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32666a;

    public /* synthetic */ C3471d(int i10) {
        this.f32666a = i10;
    }

    public static void a(Context context, Uri uri, boolean z10, C4186l c4186l) {
        AbstractC3557B.c0("options", c4186l);
        Intent intent = new Intent(context, AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
        intent.putExtra("com.auth0.android.EXTRA_LAUNCH_AS_TWA", z10);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", c4186l);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    public final String b(long j6, Long l10) {
        switch (this.f32666a) {
            case 19:
                return "Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (" + j6 + ") is after last auth at (" + l10 + ')';
            default:
                return "Expiration Time (exp) claim error in the ID token; current time (" + j6 + ") is after expiration time (" + l10 + ')';
        }
    }

    public final String c(String str, String str2) {
        switch (this.f32666a) {
            case 25:
                return "Issuer (iss) claim mismatch in the ID token, expected \"" + str + "\", found \"" + str2 + '\"';
            case 28:
                return "Organization Id (org_id) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
            default:
                return "Organization Name (org_name) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3471d(int i10, int i11) {
        this(0);
        this.f32666a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
            default:
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
        }
    }
}
