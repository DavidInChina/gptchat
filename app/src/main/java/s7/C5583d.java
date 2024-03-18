package s7;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* renamed from: s7.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5583d extends o2.b {

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f45431j = new Semaphore(0);

    /* renamed from: k  reason: collision with root package name */
    public final Set f45432k;

    public C5583d(SignInHubActivity signInHubActivity, Set set) {
        this.f40514c = false;
        this.f40515d = false;
        this.f40516e = true;
        this.f40517f = false;
        signInHubActivity.getApplicationContext();
        this.f45432k = set;
    }
}
