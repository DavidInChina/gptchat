package w7;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import w.C6060g;

/* renamed from: w7.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6131c {

    /* renamed from: a  reason: collision with root package name */
    public final Account f48107a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f48108b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f48109c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f48110d;

    /* renamed from: e  reason: collision with root package name */
    public final View f48111e;

    /* renamed from: f  reason: collision with root package name */
    public final String f48112f;

    /* renamed from: g  reason: collision with root package name */
    public final String f48113g;

    /* renamed from: h  reason: collision with root package name */
    public final L7.a f48114h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f48115i;

    public C6131c(Account account, C6060g c6060g, String str, String str2, L7.a aVar) {
        Set set;
        this.f48107a = account;
        if (c6060g == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.unmodifiableSet(c6060g);
        }
        this.f48108b = set;
        Map emptyMap = Collections.emptyMap();
        this.f48110d = emptyMap;
        this.f48112f = str;
        this.f48113g = str2;
        this.f48114h = aVar == null ? L7.a.f10751Y : aVar;
        HashSet hashSet = new HashSet(set);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f48109c = Collections.unmodifiableSet(hashSet);
        } else {
            AbstractC2469q0.p(it.next());
            throw null;
        }
    }
}
