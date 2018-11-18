  select tbl_bankadditional.job as Job,
    (
     select round(
       (select count(marital) from tbl_bankadditional where marital="married" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
    ) as Married,
    (
     select round(
       (select count(marital) from tbl_bankadditional where marital="single" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
    ) as Single,
    (
     select round(
       (select count(marital) from tbl_bankadditional where marital="divorced" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
    ) as Divorced,
    (
     select round(

       (select count(marital) from tbl_bankadditional where marital="unknown" and job="admin.") / (count(job)*0.01),2) from tbl_bankadditional where job like "%admin.%"
   ) as Unknown

   from tbl_bankadditional where job="admin." group by job

   union

   select tbl_bankadditional.job as Job,
     (
      select round(
        (select count(marital) from tbl_bankadditional where marital="married" and job="blue-collar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-collar%"
     ) as Married,
     (
      select round(
        (select count(marital) from tbl_bankadditional where marital="single" and job="blue-collar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-collar%"
     ) as Single,
     (
      select round(
        (select count(marital) from tbl_bankadditional where marital="divorced" and job="blue-collar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-collar%"
     ) as Divorced,
     (
      select round(

        (select count(marital) from tbl_bankadditional where marital="unknown" and job="blue-collar") / (count(job)*0.01),2) from tbl_bankadditional where job like "%blue-collar%"
    ) as Unknown

    from tbl_bankadditional where job="blue-collar" group by job

    union

    select tbl_bankadditional.job as Job,
      (
       select round(
         (select count(marital) from tbl_bankadditional where marital="married" and job="services") / (count(job)*0.01),2) from tbl_bankadditional where job like "%services%"
      ) as Married,
      (
       select round(
         (select count(marital) from tbl_bankadditional where marital="single" and job="services") / (count(job)*0.01),2) from tbl_bankadditional where job like "%services%"
      ) as Single,
      (
       select round(
         (select count(marital) from tbl_bankadditional where marital="divorced" and job="services") / (count(job)*0.01),2) from tbl_bankadditional where job like "%services%"
      ) as Divorced,
      (
       select round(

         (select count(marital) from tbl_bankadditional where marital="unknown" and job="services") / (count(job)*0.01),2) from tbl_bankadditional where job like "%services%"
     ) as Unknown

     from tbl_bankadditional where job="services" group by job

     union

     select tbl_bankadditional.job as Job,
       (
        select round(
          (select count(marital) from tbl_bankadditional where marital="married" and job="entrepreneur") / (count(job)*0.01),2) from tbl_bankadditional where job like "%entrepreneur%"
       ) as Married,
       (
        select round(
          (select count(marital) from tbl_bankadditional where marital="single" and job="entrepreneur") / (count(job)*0.01),2) from tbl_bankadditional where job like "%entrepreneur%"
       ) as Single,
       (
        select round(
          (select count(marital) from tbl_bankadditional where marital="divorced" and job="entrepreneur") / (count(job)*0.01),2) from tbl_bankadditional where job like "%entrepreneur%"
       ) as Divorced,
       (
        select round(

          (select count(marital) from tbl_bankadditional where marital="unknown" and job="entrepreneur") / (count(job)*0.01),2) from tbl_bankadditional where job like "%entrepreneur%"
      ) as Unknown

      from tbl_bankadditional where job="entrepreneur" group by job

      union

      select tbl_bankadditional.job as Job,
        (
         select round(
           (select count(marital) from tbl_bankadditional where marital="married" and job="self-employed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%self-employed%"
        ) as Married,
        (
         select round(
           (select count(marital) from tbl_bankadditional where marital="single" and job="self-employed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%self-employed%"
        ) as Single,
        (
         select round(
           (select count(marital) from tbl_bankadditional where marital="divorced" and job="self-employed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%self-employed%"
        ) as Divorced,
        (
         select round(

           (select count(marital) from tbl_bankadditional where marital="unknown" and job="self-employed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%self-employed%"
       ) as Unknown

       from tbl_bankadditional where job="self-employed" group by job

       union

       select tbl_bankadditional.job as Job,
         (
          select round(
            (select count(marital) from tbl_bankadditional where marital="married" and job="technician") / (count(job)*0.01),2) from tbl_bankadditional where job like "%technician%"
         ) as Married,
         (
          select round(
            (select count(marital) from tbl_bankadditional where marital="single" and job="technician") / (count(job)*0.01),2) from tbl_bankadditional where job like "%technician%"
         ) as Single,
         (
          select round(
            (select count(marital) from tbl_bankadditional where marital="divorced" and job="technician") / (count(job)*0.01),2) from tbl_bankadditional where job like "%technician%"
         ) as Divorced,
         (
          select round(

            (select count(marital) from tbl_bankadditional where marital="unknown" and job="technician") / (count(job)*0.01),2) from tbl_bankadditional where job like "%technician%"
        ) as Unknown

        from tbl_bankadditional where job="technician" group by job

        union

        select tbl_bankadditional.job as Job,
          (
           select round(
             (select count(marital) from tbl_bankadditional where marital="married" and job="management") / (count(job)*0.01),2) from tbl_bankadditional where job like "%management%"
          ) as Married,
          (
           select round(
             (select count(marital) from tbl_bankadditional where marital="single" and job="management") / (count(job)*0.01),2) from tbl_bankadditional where job like "%management%"
          ) as Single,
          (
           select round(
             (select count(marital) from tbl_bankadditional where marital="divorced" and job="management") / (count(job)*0.01),2) from tbl_bankadditional where job like "%management%"
          ) as Divorced,
          (
           select round(

             (select count(marital) from tbl_bankadditional where marital="unknown" and job="management") / (count(job)*0.01),2) from tbl_bankadditional where job like "%management%"
         ) as Unknown

         from tbl_bankadditional where job="management" group by job

         union

         select tbl_bankadditional.job as Job,
           (
            select round(
              (select count(marital) from tbl_bankadditional where marital="married" and job="student") / (count(job)*0.01),2) from tbl_bankadditional where job like "%student%"
           ) as Married,
           (
            select round(
              (select count(marital) from tbl_bankadditional where marital="single" and job="student") / (count(job)*0.01),2) from tbl_bankadditional where job like "%student%"
           ) as Single,
           (
            select round(
              (select count(marital) from tbl_bankadditional where marital="divorced" and job="student") / (count(job)*0.01),2) from tbl_bankadditional where job like "%student%"
           ) as Divorced,
           (
            select round(

              (select count(marital) from tbl_bankadditional where marital="unknown" and job="management") / (count(job)*0.01),2) from tbl_bankadditional where job like "%student%"
          ) as Unknown

          from tbl_bankadditional where job="student" group by job

          union

          select tbl_bankadditional.job as Job,
            (
             select round(
               (select count(marital) from tbl_bankadditional where marital="married" and job="retired") / (count(job)*0.01),2) from tbl_bankadditional where job like "%retired%"
            ) as Married,
            (
             select round(
               (select count(marital) from tbl_bankadditional where marital="single" and job="retired") / (count(job)*0.01),2) from tbl_bankadditional where job like "%retired%"
            ) as Single,
            (
             select round(
               (select count(marital) from tbl_bankadditional where marital="divorced" and job="retired") / (count(job)*0.01),2) from tbl_bankadditional where job like "%retired%"
            ) as Divorced,
            (
             select round(

               (select count(marital) from tbl_bankadditional where marital="unknown" and job="retired") / (count(job)*0.01),2) from tbl_bankadditional where job like "%retired%"
           ) as Unknown

           from tbl_bankadditional where job="retired" group by job

           union

           select tbl_bankadditional.job as Job,
             (
              select round(
                (select count(marital) from tbl_bankadditional where marital="married" and job="housemaid") / (count(job)*0.01),2) from tbl_bankadditional where job like "%housemaid%"
             ) as Married,
             (
              select round(
                (select count(marital) from tbl_bankadditional where marital="single" and job="housemaid") / (count(job)*0.01),2) from tbl_bankadditional where job like "%housemaid%"
             ) as Single,
             (
              select round(
                (select count(marital) from tbl_bankadditional where marital="divorced" and job="housemaid") / (count(job)*0.01),2) from tbl_bankadditional where job like "%housemaid%"
             ) as Divorced,
             (
              select round(

                (select count(marital) from tbl_bankadditional where marital="unknown" and job="housemaid") / (count(job)*0.01),2) from tbl_bankadditional where job like "%housemaid%"
            ) as Unknown

            from tbl_bankadditional where job="housemaid" group by job

            union

            select tbl_bankadditional.job as Job,
              (
               select round(
                 (select count(marital) from tbl_bankadditional where marital="married" and job="unemployed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unemployed%"
              ) as Married,
              (
               select round(
                 (select count(marital) from tbl_bankadditional where marital="single" and job="unemployed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unemployed%"
              ) as Single,
              (
               select round(
                 (select count(marital) from tbl_bankadditional where marital="divorced" and job="unemployed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unemployed%"
              ) as Divorced,
              (
               select round(

                 (select count(marital) from tbl_bankadditional where marital="unknown" and job="unemployed") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unemployed%"
             ) as Unknown

             from tbl_bankadditional where job="unemployed" group by job

             union

             select tbl_bankadditional.job as Job,
               (
                select round(
                  (select count(marital) from tbl_bankadditional where marital="married" and job="unknown") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unknown%"
               ) as Married,
               (
                select round(
                  (select count(marital) from tbl_bankadditional where marital="single" and job="unknown") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unknown%"
               ) as Single,
               (
                select round(
                  (select count(marital) from tbl_bankadditional where marital="divorced" and job="unknown") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unknown%"
               ) as Divorced,
               (
                select round(

                  (select count(marital) from tbl_bankadditional where marital="unknown" and job="unknown") / (count(job)*0.01),2) from tbl_bankadditional where job like "%unknown%"
              ) as Unknown

              from tbl_bankadditional where job="unknown" group by job;
