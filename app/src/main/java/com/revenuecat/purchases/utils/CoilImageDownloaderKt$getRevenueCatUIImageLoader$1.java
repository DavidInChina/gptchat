package com.revenuecat.purchases.utils;

import android.content.Context;
import fi.C3100a;
import i4.AbstractC3470c;
import i4.C3468a;
import id.AbstractC3557B;
import java.io.File;
import ji.C4113B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import uf.AbstractC5917j;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li4/c;", "invoke", "()Li4/c;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoilImageDownloaderKt$getRevenueCatUIImageLoader$1 extends o implements AbstractC6216a {
    final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoilImageDownloaderKt$getRevenueCatUIImageLoader$1(Context context) {
        super(0);
        this.$this_getRevenueCatUIImageLoader = context;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final AbstractC3470c mo122invoke() {
        C3468a c3468a = new C3468a();
        File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
        AbstractC3557B.b0("cacheDir", cacheDir);
        File a02 = AbstractC5917j.a0(cacheDir, "revenuecatui_cache");
        String str = C4113B.f36660Z;
        c3468a.f32659a = C3100a.g(a02);
        c3468a.f32661c = 0.0d;
        c3468a.f32664f = 26214400L;
        return c3468a.a();
    }
}
