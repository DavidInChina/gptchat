package w3;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public int f47836a;

    /* renamed from: b  reason: collision with root package name */
    public int f47837b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f47838c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47839d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f47840e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f47841f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f47842g;

    public c0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f47842g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f47836a = -1;
        this.f47837b = Integer.MIN_VALUE;
        this.f47838c = false;
        this.f47839d = false;
        this.f47840e = false;
        int[] iArr = this.f47841f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
