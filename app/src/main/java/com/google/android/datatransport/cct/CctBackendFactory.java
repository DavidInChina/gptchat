package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import c7.d;
import f7.AbstractC2940c;
import f7.C2939b;
import f7.h;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory {
    public h create(AbstractC2940c abstractC2940c) {
        C2939b c2939b = (C2939b) abstractC2940c;
        return new d(((C2939b) abstractC2940c).f29645a, c2939b.f29646b, c2939b.f29647c);
    }
}
