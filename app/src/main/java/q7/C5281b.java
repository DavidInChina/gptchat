package q7;

import Bi.c;
import F7.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import k6.AbstractC4194d;
import p7.C5097b;
import u7.AbstractC5846b;
import u7.C5845a;
import u7.h;
import u7.i;
import w7.AbstractC6134f;
import w7.C6131c;
import w7.m;
import y7.d;

/* renamed from: q7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5281b extends c {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f43972h;

    public C5281b(int i10) {
        this.f43972h = i10;
    }

    @Override // Bi.c
    public final AbstractC6134f V(Context context, Looper looper, C6131c c6131c, AbstractC5846b abstractC5846b, h hVar, i iVar) {
        AbstractC6134f abstractC6134f;
        int i10 = this.f43972h;
        switch (i10) {
            case 1:
                return new e(context, looper, c6131c, (C5097b) abstractC5846b, hVar, iVar);
            case 2:
                return new s7.e(context, looper, c6131c, (GoogleSignInOptions) abstractC5846b, hVar, iVar);
            case 3:
            case 4:
            case 5:
            default:
                switch (i10) {
                    case 0:
                        C5845a c5845a = (C5845a) abstractC5846b;
                        abstractC6134f = new AbstractC6134f(context, looper, 126, c6131c, hVar, iVar);
                        break;
                    case 1:
                    case 2:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 3:
                        AbstractC4194d.A(abstractC5846b);
                        return new e(context, looper, c6131c, hVar, iVar);
                    case 4:
                        abstractC6134f = new d(context, looper, c6131c, (m) abstractC5846b, hVar, iVar);
                        break;
                    case 5:
                        C5845a c5845a2 = (C5845a) abstractC5846b;
                        return new J7.d(context, looper, c6131c, hVar, iVar);
                }
                return abstractC6134f;
            case 6:
                L7.a aVar = (L7.a) abstractC5846b;
                Integer num = c6131c.f48115i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c6131c.f48107a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new M7.a(context, looper, c6131c, bundle, hVar, iVar);
            case 7:
                AbstractC4194d.A(abstractC5846b);
                throw null;
        }
    }
}
