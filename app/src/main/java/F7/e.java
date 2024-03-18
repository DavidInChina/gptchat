package F7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import p7.AbstractC5096a;
import p7.C5097b;
import u7.h;
import u7.i;
import v7.AbstractC5986d;
import v7.AbstractC5991i;
import w7.AbstractC6134f;
import w7.C6131c;

/* loaded from: classes2.dex */
public final class e extends AbstractC6134f {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f5068A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f5069B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v1, types: [U3.e, java.lang.Object] */
    public e(Context context, Looper looper, C6131c c6131c, C5097b c5097b, h hVar, i iVar) {
        super(context, looper, 68, c6131c, hVar, iVar);
        this.f5068A = 0;
        c5097b = c5097b == null ? C5097b.f42752h0 : c5097b;
        ?? obj = new Object();
        obj.f17400Y = Boolean.FALSE;
        C5097b c5097b2 = C5097b.f42752h0;
        c5097b.getClass();
        obj.f17400Y = Boolean.valueOf(c5097b.f42753Y);
        obj.f17401Z = c5097b.f42754Z;
        byte[] bArr = new byte[16];
        b.f5065a.nextBytes(bArr);
        obj.f17401Z = Base64.encodeToString(bArr, 11);
        this.f5069B = new C5097b(obj);
    }

    @Override // u7.AbstractC5847c
    public final int f() {
        switch (this.f5068A) {
            case 0:
                return 12800000;
            default:
                return 12451000;
        }
    }

    @Override // w7.AbstractC6134f, u7.AbstractC5847c
    public final boolean g() {
        String str;
        switch (this.f5068A) {
            case 1:
                C6131c c6131c = this.f48161w;
                Account account = c6131c.f48107a;
                if (account != null) {
                    str = account.name;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                AbstractC2469q0.p(c6131c.f48110d.get(AbstractC5096a.f42751b));
                if (c6131c.f48108b.isEmpty()) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // w7.AbstractC6134f
    public final IInterface i(IBinder iBinder) {
        switch (this.f5068A) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
                if (queryLocalInterface instanceof f) {
                    return (f) queryLocalInterface;
                }
                return new a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
                if (queryLocalInterface2 instanceof E7.a) {
                    return (E7.a) queryLocalInterface2;
                }
                return new E7.a(iBinder);
        }
    }

    @Override // w7.AbstractC6134f
    public final Bundle k() {
        int i10 = this.f5068A;
        Object obj = this.f5069B;
        switch (i10) {
            case 0:
                C5097b c5097b = (C5097b) obj;
                c5097b.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("consumer_package", null);
                bundle.putBoolean("force_save_dialog", c5097b.f42753Y);
                bundle.putString("log_session_id", c5097b.f42754Z);
                return bundle;
            default:
                return (Bundle) obj;
        }
    }

    @Override // w7.AbstractC6134f
    public final String m() {
        switch (this.f5068A) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
            default:
                return "com.google.android.gms.auth.api.internal.IAuthService";
        }
    }

    @Override // w7.AbstractC6134f
    public final String n() {
        switch (this.f5068A) {
            case 0:
                return "com.google.android.gms.auth.api.credentials.service.START";
            default:
                return "com.google.android.gms.auth.service.START";
        }
    }

    @Override // w7.AbstractC6134f
    public final boolean s() {
        switch (this.f5068A) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, Looper looper, C6131c c6131c, AbstractC5986d abstractC5986d, AbstractC5991i abstractC5991i) {
        super(context, looper, 16, c6131c, abstractC5986d, abstractC5991i);
        this.f5068A = 1;
        this.f5069B = new Bundle();
    }
}
