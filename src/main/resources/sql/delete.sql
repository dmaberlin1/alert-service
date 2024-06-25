DELETE FROM public.alerts
WHERE id IN (
    SELECT id
    FROM public.alerts
    ORDER BY id DESC
    LIMIT 5
);