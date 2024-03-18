package io.sentry;

/* renamed from: io.sentry.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3607a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f33905a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3656j0 f33906b;

    /* renamed from: c  reason: collision with root package name */
    public final String f33907c;

    /* renamed from: d  reason: collision with root package name */
    public final String f33908d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33909e;

    public C3607a(byte[] bArr, String str, String str2) {
        this.f33905a = bArr;
        this.f33906b = null;
        this.f33907c = str;
        this.f33908d = str2;
        this.f33909e = "event.attachment";
    }

    public C3607a(io.sentry.protocol.D d10) {
        this.f33905a = null;
        this.f33906b = d10;
        this.f33907c = "view-hierarchy.json";
        this.f33908d = "application/json";
        this.f33909e = "event.view_hierarchy";
    }
}
